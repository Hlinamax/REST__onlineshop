package com.vsrpp.onlineshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "edelivery", schema = "onlineshop", catalog = "")
public class Edelivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "count_of_books")
    private String countOfBooks;
    @Column(name = "date")
    private String date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(String countOfBooks) {
        this.countOfBooks = countOfBooks;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}