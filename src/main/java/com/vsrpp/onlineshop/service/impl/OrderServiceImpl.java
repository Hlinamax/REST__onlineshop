package com.vsrpp.onlineshop.service.impl;

import com.vsrpp.onlineshop.entity.Order;
import com.vsrpp.onlineshop.repository.OrderRepository;
import com.vsrpp.onlineshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findOrderById(id);
    }

    @Override
    public void delete(Long id) {
    orderRepository.deleteById(id);
    }

    @Override
    public Order findByName(String name) {
        return orderRepository.findOrderByName(name);
    }
}
