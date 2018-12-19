package com.aptitude.aptigame.AptiGame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AptiGameApplication {

  private final static Logger log = LoggerFactory.getLogger(AptiGameApplication.class);

  public static void main(String[] args) {
    log.info("Booting up the application");
    SpringApplication.run(AptiGameApplication.class, args);
  }
}
