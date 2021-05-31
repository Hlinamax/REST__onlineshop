package com.vsrpp.onlineshop.service.impl;

import com.vsrpp.onlineshop.entity.Customer;
import com.vsrpp.onlineshop.repository.CustomerRepository;
import com.vsrpp.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer findByName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findCustomerByEmail(email);
    }
}
