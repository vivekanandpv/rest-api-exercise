package com.example.restapiexercise.services;

import com.example.restapiexercise.models.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> get();
    Publisher get(int id);
    Publisher create(Publisher publisher);
    Publisher update(int id, Publisher publisher);
    void delete(int id);
}
