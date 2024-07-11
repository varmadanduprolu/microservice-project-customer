package com.varmaservices.customer;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) {

}
