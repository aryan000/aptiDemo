package com.aptitude.aptigame.AptiGame.controller;

import com.aptitude.aptigame.AptiGame.InvalidUserException;
import com.aptitude.aptigame.AptiGame.model.User;
import com.aptitude.aptigame.AptiGame.service.UserService;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class AdminController {

  @Autowired
  private UserService userService;

  @RequestMapping("/admin")
  public ModelAndView execute() {
    ModelAndView modelAndView = new ModelAndView("admin/userTable");
    List<User> users = userService.getAllUser();
    modelAndView.addObject("users", users);
    return modelAndView;
  }

  @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
  public Map<String, Boolean> deleteUser(
      @RequestParam(value = "userEmail", required = true) String userEmail)
      throws InvalidUserException {

    if (userService.deleteUser(userEmail)) {
      return Collections.singletonMap("success", true);
    }
    return Collections.singletonMap("error", true);
  }
}
