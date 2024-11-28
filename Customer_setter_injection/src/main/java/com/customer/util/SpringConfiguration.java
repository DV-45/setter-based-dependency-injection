package com.customer.util;

import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;

public class SpringConfiguration {

    @Bean
    public CustomerRepository customerRepository() {
        CustomerRepository customerRepository = new CustomerRepository();
        return customerRepository;
    }

    @Bean
    public CustomerServiceImpl customerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCount(10);
        customerService.setRepository(customerRepository());
        return customerService;
    }
}
