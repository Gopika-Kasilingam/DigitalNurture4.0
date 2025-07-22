package com.example.Code.service;

import com.example.Code.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User saveUser(User user) {
        // In real cases, save to database
        return user;
    }
}
