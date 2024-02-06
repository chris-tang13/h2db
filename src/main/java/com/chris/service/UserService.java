package com.chris.service;

import com.chris.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> allUser();
}
