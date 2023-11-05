package com.bhupi.spring6webapp.services;

import com.bhupi.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
