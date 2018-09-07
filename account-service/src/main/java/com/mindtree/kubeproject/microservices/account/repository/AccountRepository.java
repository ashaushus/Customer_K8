package com.mindtree.kubeproject.microservices.account.repository;

import java.util.List;

import com.mindtree.kubeproject.microservices.account.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    public Account findByNumber(int number);
    public List<Account> findByCustomerId(Long customerId);

}