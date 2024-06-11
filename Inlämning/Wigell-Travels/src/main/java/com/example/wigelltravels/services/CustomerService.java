package com.example.wigelltravels.services;

import com.example.wigelltravels.entites.Customers;
import com.example.wigelltravels.repositores.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customers> fetchAllCustomer() {
        return customerRepository.findAll();
    }
}
