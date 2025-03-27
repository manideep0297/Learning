package com.commerce.controller;

import com.commerce.Entity.Product;
import com.commerce.Entity.User;
import com.commerce.Entity.UserResponse;
import com.commerce.service.DevService;
import com.commerce.service.FakeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DevController {

    //This is dependency Injection

    private DevService devService;

    public DevController(@Qualifier("Student") DevService devService) {
        this.devService = devService;
    }

    private FakeService fakeService;

    public DevController(FakeService fakeService) {
        this.fakeService = fakeService;
    }

    @GetMapping("/getData")
    public String getData(){
        return devService.getData();
    }

    @GetMapping("/getSingleData/{id}/{name}")
    public String getSingleData(@PathVariable int id){
        return devService.getName();
    }

    @GetMapping("/getUserDetails")
    public String getUserDetails(@RequestParam(defaultValue = "Guest") String name, @RequestParam int id){
        if(name == null){
            // handle invalid cases
        }
        return "userDetails";
    }


    @GetMapping("/getProduct/{id}")
    public Product getSingleProduct(@PathVariable int id){
        return fakeService.getProduct(id);
    }

    /*

    /getProduct/1 -> service(FakeStoreService) -> hit fakestoreAPI call -> fetch data

        application - kdd

        account number -> details

        we will pass account number to form

        customer_id

        /getsingleuser/20

        @PathVariable


        controller - we will have redirecting -> service
        |
        service - business logic (contioning) -> repository items
        |
        repository - we will call to db -> JPA to communicate with DB

        javacode -> hibernate/mybatis/ -> Mysql/oracle

        jdbc -> java database connector

        preparedStatement
        CallableStatement

        findById() -> internally create an query and execute

        "select * from table where id = "1""

        hql ->




       @RequestParam

       get - not secured - through url
       post - secured - not url -> payload

     */

    /*
       POST -> everything secured we will pass data as payload

       login -> password...

       CRUD

       wherever your creating something we go for POST


       request.getParameter("");



       payload we will have all the in body

       url -> http:localhost:8080/createUser
       Method -> POST
       Header -> all header related details
       body -> raw data
       {
           name :

           email :

           address :
       }

        @RequestBody






       ResponseEntity -> it is useful to send the custom http responses

       form -> name, email, password, address

       @ResponseBody -> to convert to java object to json format to show it to userr

     */

    /*
      request -> {
           name :

           email :

           address :
       }

       response ->
       {
          message : "User created successfully",
          status : 200
       }


     */

     @PostMapping("/createUser")

     public ResponseEntity<UserResponse> createUser(@RequestBody User user){
         // return new UserResponse("user created successfully", 100);
         return new ResponseEntity(new UserResponse("user created successfully", 100), HttpStatus.CREATED);
     }

     @DeleteMapping("/delete/{id}")
     public String deleteUser(@PathVariable int id){
         return "delete user successfully";
     }
}

/*
For normal classes how do we create object/bean?


Spring IOC Container and bean creation

Inversion of control - heart of spring

Bean = object

maintains bean and bean lifecycle

whenever we are annotating with special annonations Controller/RestController/Configuration/Repostitory/Service

spring automatically creates obj and maintains in IOC

Dependency Injection

client -> Developer

client -> infosys -> Developer

to remove direct depency or tightly couple




request mapping -
get - to fetch the data @GetMapping("endpoint");
post - to create new data @PostMapping
put - to update the data @PutMapping
delete - to delete the data @DeleteMapping

post get/post/put

localhost:8080/getData

struts.xml


client - chinese/italina/indian
 */
