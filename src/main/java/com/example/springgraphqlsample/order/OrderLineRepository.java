package com.example.springgraphqlsample.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springgraphqlsample.order.entity.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {

}
