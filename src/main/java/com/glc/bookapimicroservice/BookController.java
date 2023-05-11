package com.glc.bookapimicroservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository repo;

    public BookController() {
        repo = new BookRepository();
    }

    // saveBook
    @PostMapping("")
    public void save(@RequestBody Book book) {
        repo.saveBook(book);
    }
}
