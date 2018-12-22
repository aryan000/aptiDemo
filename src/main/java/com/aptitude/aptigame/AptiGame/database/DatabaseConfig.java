package com.aptitude.aptigame.AptiGame.database;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * DatabaseConfig For Heroku
 */
@Configuration
@Profile("heroku")
public class DatabaseConfig {

  @Bean
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().driverClassName("org.postgresql.Driver")
        .url("jdbc:postgresql://ec2-54-243-212-227.compute-1.amazonaws.com:5432/ddcfd6v2528uum?user=fthbvkbwrqntfc&password=73431571c43d12d652ebd6e6f8af3b15c7739aacb6fbf81956a33c39f86e7ba3&sslmode=require")
        .build();
  }
}
