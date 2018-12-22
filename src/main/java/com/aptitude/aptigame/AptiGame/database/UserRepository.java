package com.aptitude.aptigame.AptiGame.database;

import com.aptitude.aptigame.AptiGame.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository<U> extends CrudRepository<User, String> {

  List<User> findByUserEmail(String useremail);

  /**
   * Finds a person by using the last name as a search criteria.
   *
   * @return A list of persons whose last name is an exact match with the given last name. If no
   * persons is found, this method returns an empty list.
   */
  @Query(value = "select * FROM customer  where user_email = ? and secret_key = ?", nativeQuery = true)
  public List<User> findByUserEmailAndSecretKey(String userEmail, String secretKey);

}
