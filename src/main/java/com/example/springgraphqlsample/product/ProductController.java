package com.example.springgraphqlsample.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springgraphqlsample.product.entity.Product;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @QueryMapping("findProducts")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @QueryMapping("productById")
    public Product findById(@Argument String id) {
        return productService.findById(id);
    }
}
