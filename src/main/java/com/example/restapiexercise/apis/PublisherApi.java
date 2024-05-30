package com.example.restapiexercise.apis;

import com.example.restapiexercise.models.Publisher;
import com.example.restapiexercise.services.PublisherService;
import com.example.restapiexercise.viewmodels.PublisherCreateViewModel;
import com.example.restapiexercise.viewmodels.PublisherUpdateViewModel;
import com.example.restapiexercise.viewmodels.PublisherViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/publishers")
public class PublisherApi {
    private final PublisherService publisherService;

    public PublisherApi(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping
    public ResponseEntity<List<PublisherViewModel>> get() {
        return ResponseEntity.ok(publisherService.get());
    }

    @GetMapping("{id}")
    public ResponseEntity<PublisherViewModel> get(@PathVariable int id) {
        return ResponseEntity.ok(publisherService.get(id));
    }

    @PostMapping
    public ResponseEntity<PublisherViewModel> create(@RequestBody PublisherCreateViewModel publisher) {
        return ResponseEntity.ok(publisherService.create(publisher));
    }

    @PutMapping("{id}")
    public ResponseEntity<PublisherViewModel> update(@PathVariable int id, @RequestBody PublisherUpdateViewModel publisher) {
        return ResponseEntity.ok(publisherService.update(id, publisher));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        publisherService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
