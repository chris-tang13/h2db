package com.chris.service.impl;

import com.chris.entity.User;
import com.chris.mapper.UserMapper;
import com.chris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> allUser() {
        return userMapper.selectList(null);
    }
}
