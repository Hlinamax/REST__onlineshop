package com.vsrpp.onlineshop.repository;

import com.vsrpp.onlineshop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findBookById(Long id);
    Book findBookByName(String name);
}
