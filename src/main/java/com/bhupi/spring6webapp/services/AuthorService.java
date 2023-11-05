package com.bhupi.spring6webapp.services;

import com.bhupi.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
