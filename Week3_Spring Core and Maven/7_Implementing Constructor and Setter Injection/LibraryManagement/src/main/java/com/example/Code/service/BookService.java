package com.example.Code.service;

import com.example.Code.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // ✅ Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // ✅ Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println(serviceName + ": " + bookRepository.findBook());
    }
}
