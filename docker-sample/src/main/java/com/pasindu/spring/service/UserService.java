package com.pasindu.spring.service;

import com.pasindu.spring.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
}
