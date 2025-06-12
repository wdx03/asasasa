package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/{id}")
    public User selectUserById(@PathVariable long id){
        User user=userService.getUserById(id);
        return user;
    }
    /**
     * 添加用户
     */
    @RequestMapping("/add")
    public User addUser(User user){
        user=userService.createUser(user);
        return user;
    }
}
