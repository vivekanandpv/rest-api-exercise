package com.example.restapiexercise.apis;

import com.example.restapiexercise.exceptions.RecordNotFoundException;
import com.example.restapiexercise.models.Book;
import com.example.restapiexercise.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    private final BookService bookService;

    public BookApi(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> get() {
        return ResponseEntity.ok(bookService.get());
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> get(@PathVariable int id) {
        return ResponseEntity.ok(bookService.get(id));
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.create(book));
    }

    @PutMapping("{id}")
    public ResponseEntity<Book> update(@PathVariable int id, @RequestBody Book book) {
        return ResponseEntity.ok(bookService.update(id, book));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
