package com.aptitude.aptigame.AptiGame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class LoginController {

  @ResponseBody
  @RequestMapping("/home")
  public String execute(){
    return "HI i am using here";
  }


  @RequestMapping("/login")
  public ModelAndView start(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    modelAndView.addObject("name","aryan");
    return modelAndView;
  }

}
