package com.stocklogger.api.repository;

import com.stocklogger.api.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{
}