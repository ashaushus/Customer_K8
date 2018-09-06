package com.mindtree.kubeproject.microservices.account.model;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="customerid")
    private Long customerId;
    private int number;

    public Account() {

    }

    public Account(Long id, Long customerId, int number) {
        this.id = id;
        this.customerId = customerId;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
