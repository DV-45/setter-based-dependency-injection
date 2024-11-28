package com.customer.service;

import com.customer.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

    private int count;
    private CustomerRepository repository;
    public CustomerServiceImpl(){

    }
    public void setCount(int count) {
        this.count = count;
    }

    public void setRepository(CustomerRepository repository){
        this.repository = repository;
    }

    @Override
    public String fetchCustomer() {
        return repository.fetchCustomer(count);
    }

    @Override
    public String createCustomer() {
        return repository.createCustomer();
    }
}
