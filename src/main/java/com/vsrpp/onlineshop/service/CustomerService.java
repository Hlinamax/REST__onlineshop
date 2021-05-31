package com.vsrpp.onlineshop.service;

import com.vsrpp.onlineshop.entity.Customer;

public interface CustomerService extends GeneralService <Customer>{
    Customer findByName(String name);

    Customer findByEmail(String email);
}




