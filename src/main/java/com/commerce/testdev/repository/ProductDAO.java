package com.commerce.testdev.repository;

import com.commerce.testdev.Entity.Product;
import com.commerce.testdev.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Products, Integer> {
    List<Products> findAll();
}
