package com.commerce.testdev.service;

import com.commerce.testdev.Entity.Customer;
import com.commerce.testdev.repository.CustomerDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
    //field DI

    public Customer create_Customer(Customer customer) {
        Customer customer1 = customerDAO.save(customer);
        return customer1;
    }

    public Customer UpdateCustomer(Customer customer){
        Customer Updatecustomer1 = customerDAO.save(customer);
        return  Updatecustomer1;
    }

    public Customer DeleteCustomer(int id){
        Customer Updatecustomer4 = customerDAO.deleteById(id);
        return  Updatecustomer4;
    }

    public Customer findCustomer(int id){
        Customer Updatecustomer2 = customerDAO.findById(id);
        return  Updatecustomer2;
    }

    public Page<Customer> getAllCustomers(Pageable pageable){
        return customerDAO.findAll(pageable);
    }

    public Customer UpdateCustomer(Customer customer){
        Customer Updatecustomer1 = customerDAO.save(customer);
        return  Updatecustomer1;
    }



    public Customer DeleteCustomer(int id){
        Customer Updatecustomer4 = customerDAO.deleteById(id);
        return  Updatecustomer4;
    }


    @Transactional
    public Customer findCustomer(int id){
        Customer Updatecustomer2 = customerDAO.findById(id);
        return  Updatecustomer2;
    }
}
/*


Spring MVC
RESTApi
Spring Data



GTA -----

start-----------------save------------

multiple tables

Person - up
university - up
address - stopped

commit / Rollback

@Transactional - annotation


successfully -
 */