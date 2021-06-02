package com.vsrpp.onlineshop.repository;
import com.vsrpp.onlineshop.entity.Customer;
import com.vsrpp.onlineshop.entity.Edelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "edelivery", path = "edelivery")
public interface EdeliveryRepository extends JpaRepository<Edelivery, Long> {

   Edelivery findEdeliveryById(Long id);

 //   Edelivery findEdeliveryByName(String name);

}
