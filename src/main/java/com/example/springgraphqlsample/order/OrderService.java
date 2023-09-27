package com.example.springgraphqlsample.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springgraphqlsample.order.entity.Order;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(String productId) {
        return orderRepository.findById(productId).orElseThrow();
    }
}
