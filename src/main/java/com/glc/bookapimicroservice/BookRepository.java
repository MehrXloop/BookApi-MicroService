package com.glc.bookapimicroservice;

import java.util.HashMap;
import java.util.Map;

public class BookRepository implements IBook<Book> {

    private Map<Integer, Book> repository;

    public BookRepository() {
        repository = new HashMap<>();
    }

    @Override
    public void saveBook(Book book) {
        repository.put(book.getId(), book);
    }

}
