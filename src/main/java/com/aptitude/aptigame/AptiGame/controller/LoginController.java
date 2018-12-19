package com.aptitude.aptigame.AptiGame.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class LoginController {

  @ResponseBody
//  @RequestMapping("/home")
  public String home() {

    System.out.println("runingn");
    return "HI i am using here";
  }


//  @RequestMapping("/main")
  public ModelAndView execute() {
    System.out.println("Reaching in execute fo main qwerty ");
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    modelAndView.addObject("name", "aryan");
    return modelAndView;
  }

//  @RequestMapping("/")
  @ResponseBody
  public ModelAndView start() {
    ModelAndView modelAndView = new ModelAndView("index");
    return modelAndView;

  }


}
