package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddCartService {

    public Products products;
    ArrayList<Products> listProd = new ArrayList<>();
    public List<Products> get_Products(Products products){
        //int x
        listProd.add(products);
        return listProd;
    }

}
