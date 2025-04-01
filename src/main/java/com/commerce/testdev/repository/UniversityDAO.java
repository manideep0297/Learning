package com.commerce.testdev.repository;

import com.commerce.testdev.Entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityDAO extends JpaRepository<University, Integer> {
    University findById(int id);
}
