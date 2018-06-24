package com.aptitude.aptigame.AptiGame.controller;

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


  @RequestMapping(value = "/login" , method = RequestMethod.POST)
  public String execute(@RequestParam("username") String username , @RequestParam("password") String password){

    if(username.equalsIgnoreCase("aryandtu@gmail.com") && password.equalsIgnoreCase("1234")){
      return "Successfully authenticated";
    }

    return "username and password does not match ";
  }


  @RequestMapping("/home")
  public ModelAndView start(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    modelAndView.addObject("name","aryan");
    return modelAndView;
  }

}
