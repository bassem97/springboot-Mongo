package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;

public interface ICustomerService  {

    List<Customer> findAll();

    Customer findByCustomerId(String id);

    Customer saveOrUpdateCustomer(Customer student);

    void deleteCustomerById(String id);
}
