package com.vsrpp.onlineshop.repository;

import com.vsrpp.onlineshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "order", path = "order")
public interface OrderRepository extends  JpaRepository<Order, Long> {
    Order findOrderById(Long id);
    Order findOrderByName(String name);
}
