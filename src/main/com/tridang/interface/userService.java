package com.tridang.service;

import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<User, Long> {
  List<User> getAllUsers();
}