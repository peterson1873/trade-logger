package com.tradelogger.api.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.tradelogger.api.model.Author;
import com.tradelogger.api.model.Book;
import com.tradelogger.api.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book>
{
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository)
    {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book)
    {
        return authorRepository.findById(book.getAuthor().getId())
                               .orElse(null);
    }
}