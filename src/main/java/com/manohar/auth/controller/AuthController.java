package com.manohar.auth.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.manohar.auth.model.User;
import com.manohar.auth.service.UserService;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {

        Map<String, String> response = new HashMap<>();

        if (userService.validate(user.getUsername(), user.getPassword())) {
            response.put("status", "success");
            response.put("message", "Login successful");
        } else {
            response.put("status", "fail");
            response.put("message", "Invalid credentials");
        }

        return response;
    }
}
