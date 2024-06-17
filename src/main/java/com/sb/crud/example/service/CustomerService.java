package com.sb.crud.example.service;

import com.sb.crud.example.request.CustomerRequest;
import com.sb.crud.example.response.APIResponse;
import org.springframework.http.ResponseEntity;


public interface CustomerService {
    ResponseEntity<APIResponse> createCustomer(CustomerRequest request);
    ResponseEntity<APIResponse> getAllCustomers();
    ResponseEntity<APIResponse> getByCustomerId(long customerId);
    ResponseEntity<APIResponse> deleteByCustomerId(long customerId);
    ResponseEntity<APIResponse> updateCustomer(long customerId, CustomerRequest request);
}
