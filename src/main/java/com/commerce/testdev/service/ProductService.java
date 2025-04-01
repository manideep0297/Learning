package com.commerce.testdev.service;

import com.commerce.testdev.Entity.Address;
import com.commerce.testdev.Entity.Person;
import com.commerce.testdev.Entity.Product;
import com.commerce.testdev.Entity.Products;
import com.commerce.testdev.repository.AddressDAO;
import com.commerce.testdev.repository.PersonDAO;
import com.commerce.testdev.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductDAO productDAO;
    private AddressDAO addressDAO;
    private PersonDAO personDAO;

    @Autowired
    public ProductService(ProductDAO productDAO, AddressDAO addressDAO, PersonDAO personDAO) {
        this.productDAO = productDAO;
        this.addressDAO = addressDAO;
        this.personDAO = personDAO;
    }

    public List<Products> getProducts() {
        List<Products> list= productDAO.findAll();
        System.out.println(list);
        return list;
    }

    public Address getAddress(int id) {
        Address address = addressDAO.findById(id);
        return address;
    }

    public Person getPerson(int id) {
        Person person = personDAO.findById(id);
        return person;
    }
}
