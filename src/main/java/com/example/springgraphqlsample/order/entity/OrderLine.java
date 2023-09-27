package com.example.springgraphqlsample.order.entity;

import com.example.springgraphqlsample.product.entity.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderlines")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "order_id", nullable = false, updatable = false)
    @ManyToOne
    private Order order;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false, updatable = false)
    private Product product;

    private int quantity;
}
