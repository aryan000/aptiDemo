package com.aptitude.aptigame.AptiGame.service;

import com.aptitude.aptigame.AptiGame.InvalidUserException;
import com.aptitude.aptigame.AptiGame.database.UserRepository;
import com.aptitude.aptigame.AptiGame.model.User;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@Slf4j
public class UserService {

  @Autowired
  private UserRepository<User> userRepository;

  @Transactional
  public List<User> getAllUser() {
    return (List<User>) userRepository.findAll();
  }

  @Transactional
  public Optional<User> getUserByemail(String userEmail) {
    log.info("Getting user by email for email id : {}", userEmail);
    return Optional.ofNullable(userRepository.findByUserEmail(userEmail))
        .filter(userList -> !CollectionUtils.isEmpty(userList))
        .map(userList -> userList.get(0));
  }

  @Transactional
  public User createUser(User user) {
    log.info("creating user for userID : {}", user);
    Optional<User> responseUser = getUserByemail(user.getUserEmail());

    if (responseUser.isPresent()) {
      return null;
    }
    return userRepository.save(user);
  }

  @Transactional
  public void deleteUser(User user) {
    log.info("Deleting User : {}", user);
    userRepository.delete(user);
  }

  @Transactional
  public boolean deleteUser(String email) throws InvalidUserException {

    Optional<User> responseUser = getUserByemail(email);

    if (responseUser.isPresent()) {
      userRepository.delete(responseUser.get());
      return true;
    } else {
      throw new InvalidUserException("No User with this email exists");
    }

  }

  @Transactional
  public boolean updateUser(User user) {
    log.info("updating user : {}", user);
    return userRepository.save(user) != null;
  }

  @Transactional
  public User findByUserEmailAndSecretKey(String userEmail, String secretKey) {
    List<User> users = userRepository.findByUserEmailAndSecretKey(userEmail, secretKey);
    return Optional.ofNullable(users).filter(userList -> !CollectionUtils.isEmpty(userList))
        .map(userList -> userList.get(0)).orElse(null);
  }

}
