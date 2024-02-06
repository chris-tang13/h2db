package com.chris.controller;

import com.chris.entity.User;
import com.chris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("adduser")
    public String addUser(User user){
        userService.addUser(user);
        return "用户添加成功";
    }

    @RequestMapping("finduser")
    public List<User> findUser(){
        return userService.allUser();
    }
}
