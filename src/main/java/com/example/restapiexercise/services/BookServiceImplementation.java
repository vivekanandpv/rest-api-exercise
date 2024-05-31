package com.example.restapiexercise.services;

import com.example.restapiexercise.exceptions.RecordNotFoundException;
import com.example.restapiexercise.models.Book;
import com.example.restapiexercise.models.Publisher;
import com.example.restapiexercise.repositories.BookRepository;
import com.example.restapiexercise.repositories.PublisherRepository;
import com.example.restapiexercise.viewmodels.BookCreateViewModel;
import com.example.restapiexercise.viewmodels.BookUpdateViewModel;
import com.example.restapiexercise.viewmodels.BookViewModel;
import com.example.restapiexercise.viewmodels.PublisherViewModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImplementation implements BookService {
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BookServiceImplementation(
            BookRepository bookRepository,
            PublisherRepository publisherRepository
    ) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<BookViewModel> get() {
        return bookRepository
                .findAll()
                .stream()
                .map(this::toViewModel)
                .collect(Collectors.toList());
    }

    @Override
    public BookViewModel get(int id) {
        return toViewModel(getEntity(id));
    }

    @Override
    public BookViewModel create(BookCreateViewModel viewModel) {
        return toViewModel(bookRepository.saveAndFlush(toEntity(viewModel)));
    }

    @Override
    public BookViewModel update(int id, BookUpdateViewModel viewModel) {
        Book entity = getEntity(id);

        BeanUtils.copyProperties(viewModel, entity);

        return toViewModel(bookRepository.saveAndFlush(entity));
    }

    @Override
    public void delete(int id) {
        Book entity = getEntity(id);
        bookRepository.delete(entity);
    }

    private BookViewModel toViewModel(Book entity) {
        BookViewModel viewModel = new BookViewModel();
        BeanUtils.copyProperties(entity, viewModel);
        viewModel.setPublisher(toViewModel(entity.getPublisher()));
        return viewModel;
    }

    private PublisherViewModel toViewModel(Publisher entity) {
        PublisherViewModel viewModel = new PublisherViewModel();
        BeanUtils.copyProperties(entity, viewModel);
        return viewModel;
    }

    private Book getEntity(int id) {
        return bookRepository
                .findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Could not find the book with id: %d", id)));
    }

    private Book toEntity(BookCreateViewModel viewModel) {
        Book entity = new Book();
        BeanUtils.copyProperties(viewModel, entity);
        entity.setPublisher(getPublisherEntity(viewModel.getPublisherId()));
        return entity;
    }

    private Publisher getPublisherEntity(int id) {
        return publisherRepository
                .findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Could not find the publisher with id: %d", id)));
    }
}
