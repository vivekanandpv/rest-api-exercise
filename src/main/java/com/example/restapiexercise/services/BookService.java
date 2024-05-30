package com.example.restapiexercise.services;

import com.example.restapiexercise.viewmodels.BookCreateViewModel;
import com.example.restapiexercise.viewmodels.BookUpdateViewModel;
import com.example.restapiexercise.viewmodels.BookViewModel;

import java.util.List;

public interface BookService {
    List<BookViewModel> get();
    BookViewModel get(int id);
    BookViewModel create(BookCreateViewModel viewModel);
    BookViewModel update(int id, BookUpdateViewModel viewModel);
    void delete(int id);
}
