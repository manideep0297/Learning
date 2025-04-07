package com.ecommorce.controller;

import com.ecommorce.Entity.Products;
import com.ecommorce.Service.AddCartService;
import com.ecommorce.Service.ProductService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class ECommerceController {

    @Autowired
    private AddCartService addCartService;

    @Autowired
    private ProductService productService;



    @PostMapping("/addToCart")
    public ResponseEntity<String> addToCart(@RequestBody Products products) {
        Optional product = productService.exists(products.getPid());
        if(product.isPresent()){
            addCartService.addToCart((Products) product.get());
            return ResponseEntity.ok("Product Added");
        }
        return ResponseEntity.ok("Product Not Added");
    }

   // anirudh implements delete mapping


    @GetMapping("/getAllCarts")
    public List<Products> getAllCarts() {
        return addCartService.getListProd();
    }

}

/*
Basic E-Commerce

basics of java -> core in which part we need to use...

  Requirements
  ============
   products - id, name, catogery, price, quantity
   catogery - cid, cname

   AddCart -> we need to implement

   payment -> we need to implement

   User - username, userid, password

   Orders -> we need to show orders -> orderid, noofitems, person_id,list of products

   search / sort / pagination / filter


 */
