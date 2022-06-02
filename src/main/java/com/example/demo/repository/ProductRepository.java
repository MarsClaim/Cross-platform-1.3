package com.example.demo.repository;

import com.example.demo.entities.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductStock, Integer> {
}
