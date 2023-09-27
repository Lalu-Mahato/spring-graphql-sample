package com.example.springgraphqlsample.order.entity;

import com.example.springgraphqlsample.customer.entity.Customer;
import com.example.springgraphqlsample.salesperson.entity.Salesperson;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "salesperson_id", nullable = false, updatable = false)
    private Salesperson salesperson;
}
