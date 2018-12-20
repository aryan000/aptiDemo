package com.aptitude.aptigame.AptiGame.controller;

import com.aptitude.aptigame.AptiGame.model.User;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
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

  private static Map<String, User> database = new HashMap<>();

  @RequestMapping("/login")
  public ModelAndView login() {
    return new ModelAndView("login");
  }


  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @ResponseBody
  public ModelAndView getLogin(@RequestParam(value = "userEmail", required = true) String userEmail,
      @RequestParam(value = "password", required = true) String password,
      HttpServletRequest request) {

    if (!database.containsKey(userEmail)) {
      return new ModelAndView("contact");
    }

    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("username", database.get(userEmail).getUsername());
    return modelAndView;

  }

  @RequestMapping(value = "/signUp", method = RequestMethod.POST)
  @ResponseBody
  public ModelAndView signUp(@RequestParam(value = "userEmail", required = true) String userEmail,
      @RequestParam(value = "username", required = true) String username,
      @RequestParam(value = "password", required = true) String password,
      HttpServletRequest request) {

    if (database.containsKey(userEmail)) {
      return new ModelAndView("contact");
    }

    database.put(userEmail,
        User.builder().userEmail(userEmail).username(username).password(password).build());

    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("username", username);
    return modelAndView;

  }

  @ResponseBody
  @RequestMapping("/test")
  public ModelAndView test() {
    ModelAndView modelAndView = new ModelAndView("test");
    modelAndView.addObject("username", "aryan");
    return modelAndView;
  }
}
