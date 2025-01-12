package com.app.UTC.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.app.UTC.model.Book;

public class FakeBookRepository implements BookRepository {

	
	
	Map<String,Book> bookMap = new HashMap<>();
	
	@Override
	public void createBook(Book book) {
		bookMap.put(book.getBookId().toString(), book);
	}

	@Override
	public Collection<Book> findAllBooks() {
		return bookMap.values();
	}

}
