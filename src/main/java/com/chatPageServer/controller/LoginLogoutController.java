package com.chatPageServer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatPageServer.model.User;

@RestController
public class LoginLogoutController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return String.format("Hello");
    }
}