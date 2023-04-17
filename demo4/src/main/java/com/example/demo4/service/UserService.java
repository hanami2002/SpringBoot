package com.example.demo4.service;

import com.example.demo4.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void deleteUser(Long id);

    Optional<User> findUserById(Long id);
}