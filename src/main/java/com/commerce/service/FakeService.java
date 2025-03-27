package com.commerce.service;

import com.commerce.Entity.Product;

public interface FakeService {
    public Product getProduct();

    Product getProduct(int id);
}
