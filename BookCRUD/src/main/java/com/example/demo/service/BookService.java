package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	
	void add(Book book);
	List<Book>display();
	Book delete(Integer id);
	void update(Book book,Integer id);
	Book search(Integer id);

}
