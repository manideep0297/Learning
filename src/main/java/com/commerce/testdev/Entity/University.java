package com.commerce.testdev.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @OneToMany( mappedBy = "university", cascade = CascadeType.ALL)
    private List<Person> person;
    // this represent many persons will come to one university

    /*
      Fetchtypes - how entity should be loaded from DB
      by default

      Lazy - not immediately

      Eager - immediately


      by default - >lazy onetomany and manytomany
      by default  ->eager onetoone and manytoone

      learn how manyTomany works?
      

     */

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
}
/*
p -> u
1    1
m    1
======
m    1  (many persons will go to one unvi)


s - c
1   m
m   1
=====
m   m

 */