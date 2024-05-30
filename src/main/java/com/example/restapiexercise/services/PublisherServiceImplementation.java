package com.example.restapiexercise.services;

import com.example.restapiexercise.viewmodels.PublisherCreateViewModel;
import com.example.restapiexercise.viewmodels.PublisherUpdateViewModel;
import com.example.restapiexercise.viewmodels.PublisherViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImplementation implements PublisherService {

    @Override
    public List<PublisherViewModel> get() {
        return List.of();
    }

    @Override
    public PublisherViewModel get(int id) {
        return null;
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
}
