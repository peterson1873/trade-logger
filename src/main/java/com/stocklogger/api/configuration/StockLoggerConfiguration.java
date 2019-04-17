package com.stocklogger.api.configuration;

import com.stocklogger.api.repository.AuthorRepository;
import com.stocklogger.api.repository.BookRepository;
import com.stocklogger.api.resolver.BookResolver;
import com.stocklogger.api.resolver.Mutation;
import com.stocklogger.api.resolver.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StockLoggerConfiguration
{
    @Bean
    public BookResolver authorResolver(AuthorRepository authorRepository)
    {
        return new BookResolver(authorRepository);
    }

    @Bean
    public Query query(AuthorRepository authorRepository, BookRepository bookRepository)
    {
        return new Query(authorRepository, bookRepository);
    }

    @Bean
    public Mutation mutation(AuthorRepository authorRepository, BookRepository bookRepository)
    {
        return new Mutation(authorRepository, bookRepository);
    }
}
