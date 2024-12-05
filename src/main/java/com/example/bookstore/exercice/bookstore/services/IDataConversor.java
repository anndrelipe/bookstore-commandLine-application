package com.example.bookstore.exercice.bookstore.services;

public interface IDataConversor {
    <T> T getData (String json, Class<T> classe);
}
