package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository br;

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		br.save(book);

	}

	@Override
	public List<Book> display() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public Book delete(Integer id) {
		// TODO Auto-generated method stub
		if(br.findById(id).isPresent()) {
			Book temp=br.findById(id).get();
			br.deleteById(id);
			return temp;
		}
		return null;
	}

	@Override
	public void update(Book book, Integer id) {
		// TODO Auto-generated method stub
		book.setId(id);
		br.save(book);

	}

	@Override
	public Book search(Integer id) {
		// TODO Auto-generated method stub
		
		if(br.findById(id).isPresent()) {
			Book temp=br.findById(id).get();
			return temp;
		}
		return null;
	}

}
