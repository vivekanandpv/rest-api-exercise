package com.example.restapiexercise.apis;

import com.example.restapiexercise.models.Book;
import com.example.restapiexercise.models.Publisher;
import com.example.restapiexercise.services.BookService;
import com.example.restapiexercise.services.PublisherService;
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
    public ResponseEntity<List<Publisher>> get() {
        return ResponseEntity.ok(publisherService.get());
    }

    @GetMapping("{id}")
    public ResponseEntity<Publisher> get(@PathVariable int id) {
        return ResponseEntity.ok(publisherService.get(id));
    }

    @PostMapping
    public ResponseEntity<Publisher> create(@RequestBody Publisher publisher) {
        return ResponseEntity.ok(publisherService.create(publisher));
    }

    @PutMapping("{id}")
    public ResponseEntity<Publisher> update(@PathVariable int id, @RequestBody Publisher publisher) {
        return ResponseEntity.ok(publisherService.update(id, publisher));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        publisherService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
