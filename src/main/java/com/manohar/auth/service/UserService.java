package com.manohar.auth.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean validate(String username, String password) {
        // Hardcoded for demo (exam-friendly)
        return "admin".equals(username) && "1234".equals(password);
    }
}
