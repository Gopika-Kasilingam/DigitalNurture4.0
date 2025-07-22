package com.example.Code.service;

import com.example.Code.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection for Spring XML config
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("BookService: " + bookRepository.findBook());
    }
}
