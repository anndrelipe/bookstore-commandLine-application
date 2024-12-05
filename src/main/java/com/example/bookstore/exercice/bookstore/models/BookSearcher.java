package com.example.bookstore.exercice.bookstore.models;
import com.example.bookstore.exercice.bookstore.services.ApiConsumer;
import com.example.bookstore.exercice.bookstore.services.DataConversor;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class BookSearcher {
    public static String searchFor (String bookName) {
        List<Book> reference = null;

        String response = ApiConsumer.getFrom("https://www.googleapis.com/books/v1/volumes?q=" +
                URLEncoder.encode(bookName, StandardCharsets.UTF_8));

        DataConversor conversor = new DataConversor();
        BookResponse result = conversor.getData(response, BookResponse.class);
        reference = result.items();

        return reference.getFirst().toString();
    }
}
