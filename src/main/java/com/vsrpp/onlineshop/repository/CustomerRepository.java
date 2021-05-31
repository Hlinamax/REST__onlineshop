package com.vsrpp.onlineshop.repository;

import com.vsrpp.onlineshop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerById(Long id);

    Customer findCustomerByName(String name);

    Customer findCustomerByEmail(String email);
}
