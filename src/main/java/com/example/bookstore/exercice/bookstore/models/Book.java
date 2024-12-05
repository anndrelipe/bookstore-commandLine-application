package com.example.bookstore.exercice.bookstore.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record Book (
        @JsonAlias ("id") String id,
        @JsonAlias ("volumeInfo") VolumeInfo volumeInfo
) {}
