package com.ecommorce.repository;

import com.ecommorce.Entity.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Products, Integer> {
    Products findById(int pid);

    Page<Products> findAll(Pageable pageable);

    List<Products> findByName(String name);

    List<Products> findByNameContainingIgnoreCase(String name);

    /* ur task to implement some kind of sql functionalities */

    /* Group by / order by / having */


}
