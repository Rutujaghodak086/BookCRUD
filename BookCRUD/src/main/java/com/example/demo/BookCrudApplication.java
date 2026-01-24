package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookCrudApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(BookCrudApplication.class, args);
		
		BookService bs=new BookService();
		bs.br.save(new Book(111, "Java", "Rutuja", 500f));
		
	}

}
