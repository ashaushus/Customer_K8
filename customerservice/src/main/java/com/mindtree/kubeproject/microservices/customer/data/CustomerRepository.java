package com.mindtree.kubeproject.microservices.customer.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mindtree.kubeproject.microservices.customer.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByPesel(String pesel);
    public Customer findById(int id);

}