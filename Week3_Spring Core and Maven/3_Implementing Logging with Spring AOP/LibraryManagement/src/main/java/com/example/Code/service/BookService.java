package com.example.Code.service;

import com.example.Code.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for Spring's dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to be intercepted by the LoggingAspect
    public void displayBook() {
        System.out.println("Book found: " + bookRepository.findBook());
    }
}
