package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter injection for Spring DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performOperation() {
        System.out.println("BookService: Performing operation...");
        bookRepository.saveBook(); // Call repository method
    }
}
