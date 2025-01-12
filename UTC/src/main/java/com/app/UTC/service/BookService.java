package com.app.UTC.service;

import com.app.UTC.dao.BookRepository;
import com.app.UTC.model.Book;

public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public void addBook(Book book) {
		this.bookRepository.createBook(book);
	}

	public int countBooks() {
		return this.bookRepository.findAllBooks().size();
	}
}
