package com.example.springgraphqlsample.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springgraphqlsample.order.entity.Order;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @QueryMapping("findOrders")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @QueryMapping("orderById")
    public Order findById(@Argument String id) {
        return orderService.findById(id);
    }
}
