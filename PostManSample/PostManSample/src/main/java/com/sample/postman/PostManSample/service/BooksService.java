package com.sample.postman.PostManSample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postman.PostManSample.entity.Books;
import com.sample.postman.PostManSample.repository.BooksRepository;

import jakarta.transaction.Transactional;

@Service
public class BooksService  {
	@Autowired
	private BooksRepository repository;
	
	public Books findByBookId(int id) {
		return repository.findByBookId(id);
	}
	public Books saveBookDetails(Books book) {
		return repository.save(book);
	}
	public List<Books> findAllBookList() {
		return repository.findAll();
	}
	public List<Books> findAllByReleaseYear(int year){
		return repository.findAllByReleaseYear(year);
	}
	
	public List<Books> findAllByAuthor(String author){
		return repository.findAllByAuthor(author);
	}
	
	public List<Books> findAllPriceBetween(double start,double end) {
		return repository.findAllByPriceBetween(start, end);
	}
	
	@Transactional
	public String updateBookPrice(int id, double price) {
		String str = "Unable to update book";
		
		int res = repository.update(id, price);
		
		if(res > 0) {
			str = "Book price updated successfully";
		}
		
		return str;
	}
	@Transactional
	public void deleteBook(int id) {
		repository.deleteByBookId(id);
	}
}
