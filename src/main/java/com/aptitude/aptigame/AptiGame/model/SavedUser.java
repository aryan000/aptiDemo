package com.aptitude.aptigame.AptiGame.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SavedUser {

  private String username;
  private String userEmail;
  private String password;
}
