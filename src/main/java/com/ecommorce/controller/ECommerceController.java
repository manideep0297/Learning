package com.ecommorce.controller;

import com.ecommorce.Entity.Products;
import com.ecommorce.Exception.SearchProductIsNull;
import com.ecommorce.Exception.UserIsNull;
import com.ecommorce.Service.AddCartService;
import com.ecommorce.Service.ProductService;
import com.ecommorce.Service.UserService;
import com.ecommorce.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ECommerceController {

    @Autowired
    private AddCartService addCartService;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;




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
    @DeleteMapping("/deleteitem/{id}")
    public Products delProduct(int p_id){
        Products deleteProduct = productService.deleteProduct(p_id);
        if(deleteProduct != null){
            return deleteProduct;
        }
        return null;
    }


    @GetMapping("/getAllCarts")
    public List<Products> getAllCarts() {
        return addCartService.getListProd();
    }

    @PostMapping("/creatuser")
    public User newuser(@RequestBody User user){
        if(user != null && user.getUname() != null && user.getPassword() != null) {
            User user1 = userService.createUser(user);
            return user1;
        }else {
            System.out.println("I am here");
            throw new UserIsNull("You entered null Exception");
        }
    }

    @GetMapping("/getuser/{id}")
    public User verifyUser(@PathVariable int u_id){
        User user = userService.Verifyuser(u_id);
        if(user != null){
            return user;
        }
        return null;
    }

    //This is to get all products
    // few cust access
    @GetMapping("/getAllProducts")
    public Page<Products> getAllProducts(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "2") int size,@RequestParam(defaultValue = "pid") String sort) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort)); // how u want to request the page by passing these pageno, size, sort
        return productService.listOfProducts(pageable);
    }

    /*
    Page

    @Pagination
     */

    //This is to search product by Name
    @GetMapping("/searchProduct")
    public List<Products> searchProduct(@RequestParam(defaultValue = "") String name){
        if(name.length()>0 && name != null)
        return productService.searchProduct(name);
        else
            throw new SearchProductIsNull("Please enter proper product to search");
    }





}




/*




Basic E-Commerce

basics of java -> core in which part we need to use...

  Requirements
  ============
  - products - id, name, catogery, price, quantity
  - catogery - cid, cname

  - AddCart -> we need to implement

   payment -> we need to implement

  - User - username, userid, password

   Orders -> we need to show orders -> orderid, noofitems, person_id,list of products

  - search / sort / pagination / filter

  - Exception Handling - for all the methods

  Login / Security (Spring Security)

  Custom Queries

  Session Handling

  AOP (Optional)



  MicroServices





 */
