package com.example.restapiexercise.services;

import com.example.restapiexercise.exceptions.RecordNotFoundException;
import com.example.restapiexercise.models.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImplementation implements PublisherService {
    @Override
    public List<Publisher> get() {
        return List.of();
    }

    @Override
    public Publisher get(int id) {
        if (id == 7) {
            throw new RecordNotFoundException(String.format("Could not find the publisher with id: %d", id));
        }

        return null;
    }

    @Override
    public Publisher create(Publisher publisher) {
        return null;
    }

    @Override
    public Publisher update(int id, Publisher publisher) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
