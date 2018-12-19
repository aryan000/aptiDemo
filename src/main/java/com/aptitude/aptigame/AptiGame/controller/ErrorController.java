package com.aptitude.aptigame.AptiGame.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestController
@Controller
@ControllerAdvice
public class ErrorController {

  private static final Logger log = LoggerFactory.getLogger(ErrorController.class);


  @RequestMapping("404")
  @ResponseBody
  public String handleNotFoundError() {
    return "Something went wrong in 404";
  }

  @RequestMapping("/500")
  @ResponseBody
  public String handleInternalServerError() {
    return "Internal Server Error has occured";
  }

  @ExceptionHandler(Exception.class)
  public String handleError(Exception e) {
    log.error("Something went wrong : ", e);
    return String.valueOf(e);
  }

  @ExceptionHandler(NoHandlerFoundException.class)
  public String handle404(HttpServletRequest request) {
    return "No handler Found for the url " + request.getRequestURI();
  }

}
