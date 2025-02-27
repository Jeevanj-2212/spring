package com.sample.postman.PostManSample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.postman.PostManSample.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
	public Books findByBookId(int id);
	public List<Books> findAllByReleaseYear(int year);
	public List<Books> findAllByAuthor(String author);
	public List<Books> findAllByTitle(String title);
	public List<Books> findAllByPriceBetween(double start,double end);
	
	@Modifying
	@Query("update Books b set b.price = :price where b.bookId = :id" )
	public int update(@Param("id") int id, @Param("price") double price);
	
	public void deleteByBookId(int id);
	
	
}
