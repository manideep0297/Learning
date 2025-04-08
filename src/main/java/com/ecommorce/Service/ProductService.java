package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import com.ecommorce.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public Optional<Products> exists(int productId) {
        return Optional.ofNullable(productDAO.findById(productId));
    }

    public List<Products> listofproducts(){
        return productDAO.findAll();
    }

    public Products deleteprod(int pid){
        return productDAO.findById(pid);
    }
}
