package com.springframework.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springframework.webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
