package com.aptitude.aptigame.AptiGame.controller;

import com.aptitude.aptigame.AptiGame.model.User;
import com.aptitude.aptigame.AptiGame.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class AdminController {

  @Autowired
  private UserService userService;

  @RequestMapping("/admin")
  public ModelAndView execute(){
    ModelAndView modelAndView = new ModelAndView("admin/userTable");
    List<User> users = userService.getAllUser();
    modelAndView.addObject("users",users);
    return modelAndView;
  }
}
