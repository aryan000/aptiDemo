package com.aptitude.aptigame.AptiGame.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AptiGameWebAppInitialiser implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    rootContext.register(AptiGameConfiguration.class);
    rootContext.setServletContext(servletContext);

    ServletRegistration.Dynamic servlet = servletContext
        .addServlet("dispatcher", new DispatcherServlet(rootContext));

    servlet.setLoadOnStartup(1);
    servlet.addMapping("/");
  }
}
