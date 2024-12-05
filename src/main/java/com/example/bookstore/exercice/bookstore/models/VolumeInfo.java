package com.example.bookstore.exercice.bookstore.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VolumeInfo (
        @JsonAlias("title") String title,
        @JsonAlias ("subtitle") String subtitle,
        @JsonAlias ("description") String description,
        @JsonAlias ("authors") String[] authors
)
{}
