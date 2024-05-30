package com.example.restapiexercise.apis;

import com.example.restapiexercise.services.BookService;
import com.example.restapiexercise.viewmodels.BookCreateViewModel;
import com.example.restapiexercise.viewmodels.BookUpdateViewModel;
import com.example.restapiexercise.viewmodels.BookViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    private final BookService bookService;

    public BookApi(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookViewModel>> get() {
        return ResponseEntity.ok(bookService.get());
    }

    @GetMapping("{id}")
    public ResponseEntity<BookViewModel> get(@PathVariable int id) {
        return ResponseEntity.ok(bookService.get(id));
    }

    @PostMapping
    public ResponseEntity<BookViewModel> create(@RequestBody BookCreateViewModel book) {
        return ResponseEntity.ok(bookService.create(book));
    }

    @PutMapping("{id}")
    public ResponseEntity<BookViewModel> update(@PathVariable int id, @RequestBody BookUpdateViewModel book) {
        return ResponseEntity.ok(bookService.update(id, book));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
