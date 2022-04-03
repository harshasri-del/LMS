package com.book.book.services;

import java.util.List;

import com.book.book.entities.Books;

public interface BookService {
	
	public List<Books> getBooks();
	public Books getBook(long booksId);
	
	public Books addBooks(Books book);
	
	public Books updateBooks(Books book);
	public void deleteBook(long parseLong);

}
