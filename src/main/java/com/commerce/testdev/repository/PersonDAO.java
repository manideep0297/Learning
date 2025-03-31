package com.commerce.testdev.repository;

import com.commerce.testdev.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person, Integer> {
    Person findById(int id);
}
