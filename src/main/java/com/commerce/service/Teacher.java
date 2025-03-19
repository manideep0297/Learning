package com.commerce.service;

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
