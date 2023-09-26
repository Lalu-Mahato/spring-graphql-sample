package com.example.springgraphqlsample.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springgraphqlsample.customer.dto.CreateCustomerDTO;
import com.example.springgraphqlsample.customer.entity.Customer;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(Integer customerId) {
        return customerRepository.findById(customerId).orElseThrow();
    }

    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    public Customer addCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = new Customer();
        customer.setFirstName(createCustomerDTO.getFirstName());
        customer.setLastName(createCustomerDTO.getLastName());
        customer.setEmail(createCustomerDTO.getEmail());
        customer.setPhoneNumber(createCustomerDTO.getPhoneNumber());
        customer.setAddress(createCustomerDTO.getAddress());
        customer.setCity(createCustomerDTO.getCity());
        customer.setState(createCustomerDTO.getState());
        customer.setZipCode(createCustomerDTO.getZipCode());
        return customerRepository.save(customer);
    }
}
