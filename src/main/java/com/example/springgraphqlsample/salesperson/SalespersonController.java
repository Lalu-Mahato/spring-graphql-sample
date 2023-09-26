package com.example.springgraphqlsample.salesperson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springgraphqlsample.salesperson.entity.Salesperson;

@Controller
public class SalespersonController {
    @Autowired
    private SalespersonService salespersonService;

    @QueryMapping("salespersonById")
    public Salesperson findById(@Argument Integer id) {
        return salespersonService.findById(id);
    }

    @QueryMapping("salespersonByEmail")
    public Salesperson findByEmail(@Argument String email) {
        return salespersonService.findByEmail(email);
    }

}
