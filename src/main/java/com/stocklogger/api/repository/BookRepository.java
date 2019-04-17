package com.stocklogger.api.repository;

import com.stocklogger.api.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>
{
}
