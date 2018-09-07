package com.mindtree.kubeproject.microservices.account.services;

import com.mindtree.kubeproject.microservices.account.model.Account;
import com.mindtree.kubeproject.microservices.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AccountServices {

    private AccountRepository accountRepository;

    @Autowired
    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Account findByNumber(int number) {
        return accountRepository.findByNumber(number);
    }

    public List<Account> findByCustomerId(Long customerId) {
        return accountRepository.findByCustomerId(customerId);
    }

    public Object findAll() {
        return accountRepository.findAll();
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
