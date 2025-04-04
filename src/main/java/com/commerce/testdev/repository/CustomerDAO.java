package com.commerce.testdev.repository;

import com.commerce.testdev.Entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
    @Override
    //enable pagination
    Page<Customer> findAll(Pageable pageable);

    Customer  findById(int id);

    Customer deleteById(int id);
}
