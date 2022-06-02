package com.example.demo.repository;

import com.example.demo.entities.Suplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuplierRepository extends JpaRepository<Suplier, Integer> {
}
