package com.vsrpp.onlineshop.service;

import com.vsrpp.onlineshop.entity.Book;

public interface BookService extends GeneralService <Book>{
    Book findByName(String name);
}