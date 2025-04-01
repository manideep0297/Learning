package com.commerce.testdev.service;

import org.springframework.stereotype.Service;

@Service("teacher")
public class Teacher implements DevService{
    @Override
    public String getData() {
        return "This is a Teacher data we are calling";
    }

    @Override
    public String getName() {
        return "This is a Teacher data we are calling";
    }
}
/*
   JPA -?

   ORM -?

   Hibernate/myBatis -?+
 */