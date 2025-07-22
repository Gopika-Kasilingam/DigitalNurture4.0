package com.example.Code.repository;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {
    public String findBook() {
        return "Spring in Action";
    }
}
