package com.example.Code.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public String findBook() {
        return "Clean Code by Robert C. Martin";
    }
}
