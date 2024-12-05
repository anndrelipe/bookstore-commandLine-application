package com.example.bookstore.exercice.bookstore.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookResponse (
        @JsonAlias("kind") String kind,
        @JsonAlias("totalItems") int totalItems,
        @JsonAlias("items") List<Book> items
) {}
