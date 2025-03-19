package com.commerce.controller;

import com.commerce.service.DevService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevController {

    // interface reference
    private DevService devService;

    public DevController(@Qualifier("teacher") DevService devService) {
        this.devService = devService;
    }

    //constructor injection

    //field injection

    //setter injection

    @GetMapping("/getData")
    public String getData(){
        return devService.getData();
    }
    @GetMapping("/getSingleData")
    public String getSingleData(){
        return devService.getName();
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
