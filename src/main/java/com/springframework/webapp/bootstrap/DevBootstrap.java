package com.springframework.webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springframework.webapp.model.Author;
import com.springframework.webapp.model.Book;
import com.springframework.webapp.model.Publisher;
import com.springframework.webapp.repositories.AuthorRepository;
import com.springframework.webapp.repositories.BookRepository;
import com.springframework.webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	private void initData() {
		
		Author eric = new Author("Eric", "Evans");
		Publisher publisher = new Publisher("Harper Collins");
		Book ddd = new Book("123", "Domain Driven Design", publisher);
		
		publisherRepository.save(publisher);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Publisher publisher1 = new Publisher("worx");
		Book noEjb = new Book("234", "J2EE Development without EJB", publisher1);
		
		publisherRepository.save(publisher1);
		authorRepository.save(rod);
		bookRepository.save(noEjb);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
}
