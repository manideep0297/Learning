package com.ecommorce.repository;

import com.ecommorce.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Products, Integer> {
    Products findById(int pid);
    List<Products> findAll();
}
