package com.mindtree.kubeproject.microservices.customer.intercomm;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.kubeproject.microservices.customer.model.Account;

@FeignClient(name="account-service", url="http://localhost:2222")
public interface AccountClient {

    @RequestMapping(method = RequestMethod.GET, value = "/accounts/customer/{customerId}")
    Account getAccounts(@PathVariable("customerId") Long customerId);

}