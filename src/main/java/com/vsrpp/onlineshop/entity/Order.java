package com.vsrpp.onlineshop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order", schema = "onlineshop", catalog = "")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = true, length = 45)
    private String name;
    @Column(name = "price", nullable = true, length = 45)
    private String price;

    @OneToMany(targetEntity = Edelivery.class, mappedBy = "order")
    private List<Edelivery> edeliverys;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}