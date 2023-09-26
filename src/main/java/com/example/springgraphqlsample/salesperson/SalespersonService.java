package com.example.springgraphqlsample.salesperson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springgraphqlsample.salesperson.entity.Salesperson;

@Service
public class SalespersonService {
    @Autowired
    private SalespersonRepository salespersonRepository;

    public Salesperson findById(Integer id) {
        return salespersonRepository.findById(id).orElseThrow();
    }

    public Salesperson findByEmail(String email) {
        return salespersonRepository.findByEmail(email);
    }

}
