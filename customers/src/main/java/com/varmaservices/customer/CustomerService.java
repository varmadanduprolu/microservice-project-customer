package com.varmaservices.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository repository;
    public void registerCustomer(CustomerRequest request) {
        Customer customer= Customer.builder().
                firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        repository.save(customer);
    }
}
 