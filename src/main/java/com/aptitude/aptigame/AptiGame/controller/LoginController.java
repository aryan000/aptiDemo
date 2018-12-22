package com.aptitude.aptigame.AptiGame.controller;

import com.aptitude.aptigame.AptiGame.model.SavedUser;
import com.aptitude.aptigame.AptiGame.model.User;
import com.aptitude.aptigame.AptiGame.service.UserService;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class LoginController {

  private static Map<String, SavedUser> database = new HashMap<>();

  @Autowired
  private UserService userService;

  @RequestMapping({"/", "/login"})
  public ModelAndView login() {
    return new ModelAndView("login/login");
  }


  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @ResponseBody
  public ModelAndView getLogin(
      @RequestParam(value = "userEmail", required = true) String userEmail,
      @RequestParam(value = "password", required = true) String password,
      HttpServletRequest request) {

    User user = userService.findByUserEmailAndSecretKey(userEmail, password);

    ModelAndView modelAndView = new ModelAndView();
    if (user != null) {
      modelAndView.setViewName("index");
      modelAndView.addObject("username", user.getUserName());

    } else {
      modelAndView.setViewName("login/login");
      modelAndView.addObject("showWarningMessage", true);
      modelAndView.addObject("warn_message",
          "Incorrect useremail / Password. Please try again with correct credentials");
    }
    return modelAndView;

  }

  @RequestMapping(value = "/signUp", method = RequestMethod.POST)
  @ResponseBody
  public ModelAndView signUp(
      @RequestParam(value = "userEmail", required = true) String userEmail,
      @RequestParam(value = "username", required = true) String username,
      @RequestParam(value = "password", required = true) String password,
      @RequestParam(value = "firstName", required = true) String firstName,
      @RequestParam(value = "lastName", required = true) String lastName,

      HttpServletRequest request) {

    User createdUser = userService.createUser(
        User.builder().userEmail(userEmail).firstName(firstName).lastName(lastName)
            .userName(username).secretKey(password).build());

    if (createdUser == null) {
      ModelAndView modelAndView = new ModelAndView("login/login");
      modelAndView.addObject("showWarningMessage", true);
      modelAndView.addObject("warn_message",
          "User already Exists.Please choose another emailId Or Login with sameone");
      return modelAndView;
    } else {
      ModelAndView modelAndView = new ModelAndView("/index");
      modelAndView.addObject("username", createdUser.getUserName());
      return modelAndView;
    }

  }

  @ResponseBody
  @RequestMapping("/test")
  public ModelAndView test() {
    ModelAndView modelAndView = new ModelAndView("test");
    modelAndView.addObject("username", "aryan");
    return modelAndView;
  }
}
