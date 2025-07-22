package com.example.Code.service;

import com.example.Code.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Book found: " + bookRepository.findBook());
    }
}
