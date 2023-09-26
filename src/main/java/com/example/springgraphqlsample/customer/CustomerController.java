package com.example.springgraphqlsample.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springgraphqlsample.customer.dto.CreateCustomerDTO;
import com.example.springgraphqlsample.customer.entity.Customer;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @QueryMapping("findCustomers")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @QueryMapping("customerById")
    public Customer findById(@Argument Integer id) {
        return customerService.findById(id);
    }

    @QueryMapping("customerByEmail")
    public Customer findByEmail(@Argument String email) {
        return customerService.findByEmail(email);
    }

    @MutationMapping("addCustomer")
    public Customer addCustomer(@Argument("input") CreateCustomerDTO createCustomerDTO) {
        return customerService.addCustomer(createCustomerDTO);
    }
}
