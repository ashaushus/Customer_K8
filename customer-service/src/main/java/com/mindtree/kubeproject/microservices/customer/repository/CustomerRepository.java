package com.mindtree.kubeproject.microservices.customer.repository;

import com.mindtree.kubeproject.microservices.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public Customer findByPesel(String pesel);
    public Customer findById(Long id);

}