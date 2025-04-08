package com.ecommorce.controller;

import com.ecommorce.Entity.User;
import com.ecommorce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ECommerceController {

    @Autowired
    public UserService userService;


    @PostMapping("/creatuser")
    public User newuser(@RequestBody User user){
        User userService1 = userService.createuser(user);
        return userService1;
    }

    @GetMapping("/getuser/{id}")
    public User Vefuser(@PathVariable int uid){
        User userService2 = userService.Verifyuser(uid);
        if(userService2!= null){
            return userService2;
        }
       return null;
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
