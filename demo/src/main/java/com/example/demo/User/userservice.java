package com.example.demo.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userservice {

    private final List<user> users = new ArrayList<>();

    // Ініціалізація кількох користувачів
    public userservice() {
        users.add(new user(1L, "Іван", "ivan@example.com"));
        users.add(new user(2L, "Оля", "olga@example.com"));
        users.add(new user(3L, "Петро", "petro@example.com"));
    }

    // Отримати список усіх користувачів
    public List<user> getAllUsers() {
        return users;
    }
}