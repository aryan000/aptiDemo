package com.aptitude.aptigame.AptiGame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class HomeController {

  @RequestMapping("index")
  @ResponseBody
  public ModelAndView execute() {
    return new ModelAndView("index");
  }

//  @RequestMapping({"/","login"})
//  @ResponseBody
//  public ModelAndView login() {
//    return new ModelAndView("login/login");
//  }

  @RequestMapping({"/blog"})
  @ResponseBody
  public ModelAndView execute_blog() {
    return new ModelAndView("blog");
  }

  @RequestMapping({"/about"})
  @ResponseBody
  public ModelAndView execute_about() {
    return new ModelAndView("about");
  }

  @RequestMapping({"/contact"})
  @ResponseBody
  public ModelAndView execute_contact() {
    return new ModelAndView("contact");
  }

  @RequestMapping({"proj1"})
  @ResponseBody
  public ModelAndView execute_proj1() {
    return new ModelAndView("proj1");
  }

  @RequestMapping({"projects"})
  @ResponseBody
  public ModelAndView execute_projects() {
    return new ModelAndView("projects");
  }


  @RequestMapping({"singlepost"})
  @ResponseBody
  public ModelAndView execute_singlepost() {
    return new ModelAndView("singlepost");
  }


}
