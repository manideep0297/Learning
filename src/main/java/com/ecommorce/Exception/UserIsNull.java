package com.ecommorce.Exception;
//This is an custom exception class
public class UserIsNull extends RuntimeException{
    public UserIsNull(String msg){
        super(msg);
    }
}
