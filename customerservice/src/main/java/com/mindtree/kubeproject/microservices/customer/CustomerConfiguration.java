package com.mindtree.kubeproject.microservices.customer;


import org.springframework.cloud.sleuth.sampler.ProbabilityBasedSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mindtree.kubeproject.microservices.customer")
public class CustomerConfiguration {

    @Bean
    public ProbabilityBasedSampler defaultSampler() {
        return new ProbabilityBasedSampler(null);
    }

}