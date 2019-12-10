package com.springframework.webapp.model;

import java.util.HashSet;
import java.util.Set;

public class Book {

	private String isbn;
	private String title;
	private String publisher;
	
	private Set<Author> authors = new HashSet<Author>();

	public Book() {
	}

	public Book(String isbn, String title, String publisher) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
	}

	public Book(String isbn, String title, String publisher, Set<Author> authors) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
}
