package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import com.ecommorce.repository.ProductDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Transactional
    public Optional<Products> exists(int productId) {
        return productDAO.findById(productId);
    }
}
