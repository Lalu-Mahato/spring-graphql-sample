package com.example.springgraphqlsample.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springgraphqlsample.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}
