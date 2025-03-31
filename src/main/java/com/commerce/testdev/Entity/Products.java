package com.commerce.testdev.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double price;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

/*
1:1
1:m/m:1
m:m

student -> cse
1          1
student -> cse
m        1

m(branch can have many student)        1(student can have only 1 branch)


1 - > 1

product
@121
category

@EmbeddedId - composite primary keys


 */
