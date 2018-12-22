package com.aptitude.aptigame.AptiGame.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // This annotation allows entity manager to use this class and puts it in context.
@Table(name = "customer") // associates a class with a table in the database.
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

  private static final long serialVersionUID = -3009157732242241606L;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Id  //says that this field is the primary key.
  @Column(name = "user_email")
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // Defines the strategy for generating the primary key
  private String userEmail;

  @Column(name = "secret_key")
  private String secretKey; // secret key for auth and password for db sign ups.

}
