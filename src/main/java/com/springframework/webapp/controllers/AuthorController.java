package com.springframework.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springframework.webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}


	//this method returns the view name
	@RequestMapping("/authors")
	public String getBook(Model model) {

		model.addAttribute("authors", authorRepository.findAll());
		
		return "authors";
	}
}
