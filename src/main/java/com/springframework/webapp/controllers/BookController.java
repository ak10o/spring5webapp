package com.springframework.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.webapp.repositories.BookRepository;

@Controller
public class BookController {

	private BookRepository bookRepository;
	
	@Autowired
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	//this method returns the view name
	@RequestMapping("/books")
	public String getBook(Model model) {

		model.addAttribute("books", bookRepository.findAll());
		
		//the file name of the thymeleaf must be same as view name, so that the mapping can be
		//performed.
		return "books";
	}
}
