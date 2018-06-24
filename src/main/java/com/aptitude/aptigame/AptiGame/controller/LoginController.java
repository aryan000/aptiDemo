package com.aptitude.aptigame.AptiGame.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
  public String execute(HttpServletRequest request , HttpServletResponse response){

//    if(username.equalsIgnoreCase("aryandtu@gmail.com") && password.equalsIgnoreCase("1234")){
//      return "Successfully authenticated";
//    }

    Map<String, String[]> params = request.getParameterMap();

    params.forEach((key,value)->{
      System.out.println("key is : " + key + " and value is : " + value[0]);
    });
q
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
