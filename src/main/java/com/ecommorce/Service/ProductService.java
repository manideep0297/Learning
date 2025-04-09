package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import com.ecommorce.repository.ProductDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Transactional
    public Optional<Products> exists(int productId) {
        return Optional.ofNullable(productDAO.findById(productId));
    }

    public List<Products> listofproducts(){
        return productDAO.findAll();
    }

    public Products deleteProduct(int p_id){
        Products p = productDAO.findById(p_id);
        if(p != null){
            productDAO.deleteById(p_id);
            return p;
        }
        return null;
    }

    public Page<Products> listOfProducts(Pageable pageable){
        return productDAO.findAll(pageable);
    }

    public List<Products> searchProduct(String name){
        return productDAO.findByNameContainingIgnoreCase(name);
    }
}
