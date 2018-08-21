package com.mindtree.kubeproject.microservices.account.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mindtree.kubeproject.microservices.account.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

    public Account findByNumber(String number);
    public List<Account> findByCustomerId(String customerId);

}