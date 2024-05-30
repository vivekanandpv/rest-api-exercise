package com.example.restapiexercise.services;

import com.example.restapiexercise.models.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {
    private final String title;
    private final int pages;

    public BookServiceImplementation(
            @Value("${app.book.title}") String title,
            @Value("${app.book.pages}") int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public List<Book> get() {
        return List.of();
    }

    @Override
    public Book get(int id) {
        Book book = new Book();
        book.setBookId(id);
        book.setTitle(title);
        book.setPages(pages);

        return book;
    }

    @Override
    public Book create(Book book) {
        return book;
    }

    @Override
    public Book update(int id, Book book) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
