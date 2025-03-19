package com.commerce.service;

import org.springframework.stereotype.Service;

@Service("student")
public class Student implements DevService{
    @Override
    public String getData() {
        return "This is a student data we are calling";
    }

    @Override
    public String getName() {
        return "This is a student name we are calling";
    }
}
