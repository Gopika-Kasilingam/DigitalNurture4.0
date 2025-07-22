package com.example.Code.service;

import com.example.Code.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void displayBook() {
        System.out.println("Book found: " + bookRepository.findBook());
    }
}
