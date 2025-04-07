package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddCartService {

    public Products products;
    ArrayList<Products> listProd = new ArrayList<>();

    public void addToCart(Products product){
        listProd.add(product);
    }

    public void removeFromCart(Products product){
        listProd.remove(product);
    }

    public List<Products> getListProd(){
        return listProd;
    }

}

/*
  /addcart/1
  /addcart/2

  getCartItems
 */
