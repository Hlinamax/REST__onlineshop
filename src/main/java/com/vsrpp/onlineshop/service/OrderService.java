package com.vsrpp.onlineshop.service;

import com.vsrpp.onlineshop.entity.Order;

public interface OrderService extends GeneralService <Order> {
    Order findByName(String name);
}
