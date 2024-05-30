package com.example.restapiexercise.services;

import com.example.restapiexercise.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {
    @Override
    public List<Book> get() {
        return List.of();
    }

    @Override
    public Book get(int id) {
        return null;
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book update(int id, Book book) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
