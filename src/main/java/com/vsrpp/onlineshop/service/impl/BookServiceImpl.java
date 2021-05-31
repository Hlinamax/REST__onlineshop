package com.vsrpp.onlineshop.service.impl;

import com.vsrpp.onlineshop.entity.Book;
import com.vsrpp.onlineshop.repository.BookRepository;
import com.vsrpp.onlineshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book findByName(String name)
    {
        return bookRepository.findBookByName(name);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}















