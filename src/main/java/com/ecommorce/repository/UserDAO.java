package com.ecommorce.repository;

import com.ecommorce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    User save(User user);

    User findById(int id);

}
