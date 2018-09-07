package com.mindtree.kubeproject.microservices.account.controller;

import com.mindtree.kubeproject.microservices.account.model.Account;
import com.mindtree.kubeproject.microservices.account.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class Api {

    protected Logger logger = Logger.getLogger(Api.class.getName());

    @Autowired
    private AccountServices accountServices;

    @RequestMapping("/accounts/{number}")
    public Account findByNumber(@PathVariable("number") int number) {
        logger.info(String.format("Account.findByNumber(%s)", number));
        return accountServices.findByNumber(number);
    }

    @RequestMapping("/accounts/customer/{customer}")
    public List<Account> findByCustomer(@PathVariable("customer") Long customerId) {
        logger.info(String.format("Account.findByCustomer(%s)", customerId));
        return accountServices.findByCustomerId(customerId);
    }

    @RequestMapping("/accounts")
    public List<Account> findAll() {
        logger.info("Account.findAll()");
        List<Account> accounts = (List<Account>) accountServices.findAll();

        return accounts;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/accounts")
    public Account add(@RequestBody Account account) {
        logger.info(String.format("Account.add(%s)", account));
        return accountServices.save(account);
    }

}
