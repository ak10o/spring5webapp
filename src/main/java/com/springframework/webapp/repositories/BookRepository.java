package com.springframework.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
