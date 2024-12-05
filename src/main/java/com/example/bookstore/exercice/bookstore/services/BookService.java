package com.example.bookstore.exercice.bookstore.services;

import com.example.bookstore.exercice.bookstore.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService implements IRepository<Book> {

    private List<Book> books = new ArrayList<>();

    @Override
    public void findAll() {
        for (Book book : this.books) {
            System.out.printf("""
                    {
                        "id": "%s",
                        "title": "%s",
                        "subtitle": "%s",
                        "description": "%s",
                        "authors": "%s"
                    }
                    """, book.id(), book.volumeInfo().title(), book.volumeInfo().subtitle(), book.volumeInfo().description(), book.volumeInfo().authors());
        }
    }

    @Override
    public void deleteById(String id) {
        this.books.removeIf(book -> book.id().equals(id));
    }

    @Override
    public void save(Book newBook) {
        this.books.add(newBook);
    }

    @Override
    public void findById(String id) {
        for (Book book : this.books) {
            if (book.id().equals(id)) {
                System.out.printf("""
                    {
                        "id": "%s",
                        "title": "%s",
                        "subtitle": "%s",
                        "description": "%s",
                        "authors": "%s"
                    }
                    """, book.id(), book.volumeInfo().title(), book.volumeInfo().subtitle(), book.volumeInfo().description(), book.volumeInfo().authors());
            }
        }
    }
}
