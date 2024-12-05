package com.example.bookstore.exercice.bookstore.services;

import java.util.List;

public interface IRepository<T> {
    void save (T t);
    void findById (String id);
    void findAll ();
    void deleteById (String id);
}
