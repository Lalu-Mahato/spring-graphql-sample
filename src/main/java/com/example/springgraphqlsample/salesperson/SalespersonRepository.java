package com.example.springgraphqlsample.salesperson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springgraphqlsample.salesperson.entity.Salesperson;

@Repository
public interface SalespersonRepository extends JpaRepository<Salesperson, Integer> {
    Salesperson findByEmail(String email);
}
