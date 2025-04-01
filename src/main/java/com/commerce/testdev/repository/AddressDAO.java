package com.commerce.testdev.repository;

import com.commerce.testdev.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDAO extends JpaRepository<Address, Integer> {

    Address findById(int id);
}
/*

   select a1_0.id,p1_0.id,p1_0.name,a1_0.street from address a1_0
    left join person p1_0 on a1_0.id=p1_0.address_id where a1_0.id=?



 */