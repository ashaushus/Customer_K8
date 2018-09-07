package com.mindtree.kubeproject.microservices.customer.services;

import com.google.common.collect.Lists;
import com.mindtree.kubeproject.microservices.customer.model.Customer;
import com.mindtree.kubeproject.microservices.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> findAll() {
        return Lists.newArrayList(customerRepository.findAll());
    }

    public Customer findByPesel(String pesel) {
        return customerRepository.findByPesel(pesel);
    }
}
