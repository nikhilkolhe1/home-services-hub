package com.example.homeservice.controllers;

import com.example.homeservice.models.User;
import com.example.homeservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully!";
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }
}
