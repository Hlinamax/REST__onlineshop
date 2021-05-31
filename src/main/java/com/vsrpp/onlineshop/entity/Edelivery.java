package com.vsrpp.onlineshop.entity;

import org.hibernate.annotations.ManyToAny;

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

    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "id_order", referencedColumnName = "id")
    private Order order;

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