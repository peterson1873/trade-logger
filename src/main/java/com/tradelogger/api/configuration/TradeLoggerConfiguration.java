package com.tradelogger.api.configuration;

import com.tradelogger.api.repository.AuthorRepository;
import com.tradelogger.api.repository.BookRepository;
import com.tradelogger.api.resolver.BookResolver;
import com.tradelogger.api.resolver.Mutation;
import com.tradelogger.api.resolver.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TradeLoggerConfiguration
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
