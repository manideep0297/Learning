package com.ecommorce.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int cid;
    public String cname;
    @OneToMany(mappedBy = "category",cascade =CascadeType.ALL)
    public List<Products> products;
}


