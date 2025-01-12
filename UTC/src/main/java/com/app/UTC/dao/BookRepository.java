package com.app.UTC.dao;

import java.util.Collection;

import com.app.UTC.model.Book;

public interface BookRepository {

	void createBook(Book book);
	Collection<Book> findAllBooks();
}
