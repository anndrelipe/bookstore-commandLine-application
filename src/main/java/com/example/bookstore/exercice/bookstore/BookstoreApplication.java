package com.example.bookstore.exercice.bookstore;

import com.example.bookstore.exercice.bookstore.models.BookSearcher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String data = BookSearcher.searchFor("Harry Potter");
		System.out.println(data);
	}
}
