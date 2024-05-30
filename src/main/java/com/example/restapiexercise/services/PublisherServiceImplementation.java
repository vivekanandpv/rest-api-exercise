package com.example.restapiexercise.services;

import com.example.restapiexercise.exceptions.RecordNotFoundException;
import com.example.restapiexercise.models.Publisher;
import com.example.restapiexercise.repositories.PublisherRepository;
import com.example.restapiexercise.viewmodels.PublisherCreateViewModel;
import com.example.restapiexercise.viewmodels.PublisherUpdateViewModel;
import com.example.restapiexercise.viewmodels.PublisherViewModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublisherServiceImplementation implements PublisherService {
    private final PublisherRepository publisherRepository;

    public PublisherServiceImplementation(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<PublisherViewModel> get() {
        return publisherRepository
                .findAll()
                .stream()
                .map(this::toViewModel)
                .collect(Collectors.toList());
    }

    @Override
    public PublisherViewModel get(int id) {
        return toViewModel(getEntity(id));
    }

    @Override
    public PublisherViewModel create(PublisherCreateViewModel viewModel) {
        return null;
    }

    @Override
    public PublisherViewModel update(int id, PublisherUpdateViewModel viewModel) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    private PublisherViewModel toViewModel(Publisher entity) {
        PublisherViewModel viewModel = new PublisherViewModel();
        BeanUtils.copyProperties(entity, viewModel);
        return viewModel;
    }

    private Publisher getEntity(int id) {
        return publisherRepository
                .findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Could not find the publisher with id: %d", id)));
    }

    private Publisher toEntity(PublisherCreateViewModel viewModel) {
        Publisher entity = new Publisher();
        BeanUtils.copyProperties(viewModel, entity);
        return entity;
    }
}
