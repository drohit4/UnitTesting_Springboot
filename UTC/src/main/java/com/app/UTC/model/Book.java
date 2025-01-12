package com.app.UTC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private Long bookId;
	private String bookName;
	private String author;
	private int price;
}
