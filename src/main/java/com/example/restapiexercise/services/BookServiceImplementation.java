package com.example.restapiexercise.services;

import com.example.restapiexercise.repositories.BookRepository;
import com.example.restapiexercise.viewmodels.BookCreateViewModel;
import com.example.restapiexercise.viewmodels.BookUpdateViewModel;
import com.example.restapiexercise.viewmodels.BookViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookViewModel> get() {
        return List.of();
    }

    @Override
    public BookViewModel get(int id) {
        return null;
    }

    @Override
    public BookViewModel create(BookCreateViewModel viewModel) {
        return null;
    }

    @Override
    public BookViewModel update(int id, BookUpdateViewModel viewModel) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
