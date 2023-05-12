package com.glc.bookapimicroservice;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository repo;

    public BookController(BookRepository repo) {
        this.repo = repo;
    }

    // saveBook
    @PostMapping("")
    public void save(@RequestBody Book book) {
        repo.saveBook(book);
    }

    // viewAllBook
    @GetMapping("")
    public Collection<Book> view() {
        return repo.viewAllBook();

    }

    // deleteBook
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repo.deleteBook(id);

    }

    // updateBook
    @PutMapping("")
    public void update(@RequestBody Book book) {
        repo.updateBook(book);
    }
}
