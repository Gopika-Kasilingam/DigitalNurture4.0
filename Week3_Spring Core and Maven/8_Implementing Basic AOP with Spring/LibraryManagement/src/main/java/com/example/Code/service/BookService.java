package com.example.Code.service;

import com.example.Code.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("BookService: " + bookRepository.findBook());
    }
}
