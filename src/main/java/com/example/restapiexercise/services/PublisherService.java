package com.example.restapiexercise.services;

import com.example.restapiexercise.viewmodels.PublisherCreateViewModel;
import com.example.restapiexercise.viewmodels.PublisherUpdateViewModel;
import com.example.restapiexercise.viewmodels.PublisherViewModel;

import java.util.List;

public interface PublisherService {
    List<PublisherViewModel> get();
    PublisherViewModel get(int id);
    PublisherViewModel create(PublisherCreateViewModel viewModel);
    PublisherViewModel update(int id, PublisherUpdateViewModel viewModel);
    void delete(int id);
}
