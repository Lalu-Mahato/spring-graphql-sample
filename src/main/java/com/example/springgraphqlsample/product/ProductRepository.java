package com.example.springgraphqlsample.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springgraphqlsample.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
