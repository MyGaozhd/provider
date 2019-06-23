package com.servi.cloud.provider.controller;


import com.servi.cloud.provider.entry.User;
import com.servi.cloud.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable String id) {

        return userService.findUserById(id);
    }
}
