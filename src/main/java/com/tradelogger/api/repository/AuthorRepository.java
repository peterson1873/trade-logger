package com.tradelogger.api.repository;

import com.tradelogger.api.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{
}