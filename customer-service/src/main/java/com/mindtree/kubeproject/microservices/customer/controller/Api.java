package com.mindtree.kubeproject.microservices.customer.controller;

import com.mindtree.kubeproject.microservices.customer.intercomm.AccountClient;
import com.mindtree.kubeproject.microservices.customer.model.Account;
import com.mindtree.kubeproject.microservices.customer.model.Customer;
import com.mindtree.kubeproject.microservices.customer.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class Api {

    @Autowired
    private AccountClient accountClient;

    @Autowired
    CustomerServices customerServices;

    protected Logger logger = Logger.getLogger(Api.class.getName());

    @RequestMapping("/customers/pesel/{pesel}")
    public Customer findByPesel(@PathVariable("pesel") String pesel) {
        logger.info(String.format("Customer.findByPesel(%s)", pesel));
        return customerServices.findByPesel(pesel);
    }

    @RequestMapping("/customers")
    public List<Customer> findAll() {
        logger.info("Customer.findAll()");
        return customerServices.findAll();
    }

    @RequestMapping("/customers/{id}")
    public Customer findById(@PathVariable("id") Long id) {
        logger.info(String.format("Customer.findById(%s)", id));
        Customer customer = customerServices.findById(id);
        Account account =  accountClient.getAccounts(id);
        customer.setAccount(account);
        return customer;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public Customer add(@RequestBody Customer customer) {
        logger.info(String.format("Customer.add(%s)", customer));
        return customerServices.save(customer);
    }

}