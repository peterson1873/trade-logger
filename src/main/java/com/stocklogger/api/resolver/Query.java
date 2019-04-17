package com.stocklogger.api.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.stocklogger.api.model.Author;
import com.stocklogger.api.model.Book;
import com.stocklogger.api.repository.AuthorRepository;
import com.stocklogger.api.repository.BookRepository;

public class Query implements GraphQLQueryResolver
{
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks()
    {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors()
    {
        return authorRepository.findAll();
    }

    public long countBooks()
    {
        return bookRepository.count();
    }

    public long countAuthors()
    {
        return authorRepository.count();
    }
}
