package com.sample.postman.PostManSample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postman.PostManSample.entity.Books;
import com.sample.postman.PostManSample.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksService service;
	
	@GetMapping
	public List<Books> listAllBooks() {
		return service.findAllBookList();
	}
	
	@GetMapping("/{id}")
	public Books retrieveBook(@PathVariable int id) {
		return service.findByBookId(id);
	}
	
	@GetMapping("/author/{author}")
	public List<Books> listAllBooksByAuthor(@PathVariable String author) {
		return service.findAllByAuthor(author);
	}
	
	@PostMapping
	public Books saveBookDetails(@RequestBody Books book) {
		return service.saveBookDetails(book);
	}
	
	@PatchMapping("/update/{id}/{price}")
	public String updatePrice(@PathVariable int id, @PathVariable double price) {
		return service.updateBookPrice(id, price);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		service.deleteBook(id);
		return "Book deleted";
	}
}