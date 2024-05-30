package com.example.restapiexercise.services;

import com.example.restapiexercise.models.Book;

import java.util.List;

public interface BookService {
    List<Book> get();
    Book get(int id);
    Book create(Book book);
    Book update(int id, Book book);
    void delete(int id);
}
