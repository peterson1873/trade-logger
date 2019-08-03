package com.tradelogger.api.repository;

import com.tradelogger.api.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>
{
}
