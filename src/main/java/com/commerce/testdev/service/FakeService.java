package com.commerce.testdev.service;


import com.commerce.testdev.Entity.Product;

public interface FakeService {
    public Product getProducts();

    Product getProduct(int id);
}
