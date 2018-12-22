package com.aptitude.aptigame.AptiGame.interceptors;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

  private static final String aptiQCookieName = "aptiq-credentials";

  private Optional<Cookie> getAptiqCookie(List<Cookie> cookies) {
    return cookies.stream()
        .filter(cookie -> aptiQCookieName.equals(cookie.getName()) && cookie.getMaxAge() < 12)
        .findFirst();
  }

  private void authenticateUser(HttpServletRequest request, HttpServletResponse response)
      throws IOException {

    Optional<Cookie[]> cookies = Optional.ofNullable(request.getCookies());

    Optional<Cookie> userCookie = Optional.empty();

    if (cookies.isPresent()) {
      userCookie = getAptiqCookie(Arrays.asList(request.getCookies()));
    }

    if (!userCookie.isPresent() && !(request.getRequestURI().equals("/") || request.getRequestURI()
        .equals("/login"))) {
      response.sendRedirect("/");
    }

  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

//    authenticateUser(request, response);

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      @Nullable ModelAndView modelAndView) throws Exception {
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, @Nullable Exception ex) throws Exception {
  }
}
