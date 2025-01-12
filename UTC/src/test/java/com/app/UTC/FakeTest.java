package com.app.UTC;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.UTC.dao.BookRepository;
import com.app.UTC.dao.FakeBookRepository;
import com.app.UTC.model.Book;
import com.app.UTC.service.BookService;

public class FakeTest {

	@Test
	public void testFakBook() {
		BookRepository bookRepository = new FakeBookRepository();
		BookService bookService = new BookService(bookRepository);
		
		bookService.addBook(new Book(101L,"WOW Book","WoW Writer",125));
		bookService.addBook(new Book(102L,"WOW Book2","WOW wrter",125));
		
		assertEquals(2, bookRepository.findAllBooks().size());
	}
}

