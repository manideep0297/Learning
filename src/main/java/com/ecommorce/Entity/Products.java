package com.ecommorce.Entity;

import jakarta.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int pid;
    public String name;
    @ManyToOne
    @JoinColumn(name="cid")
    public  Category Category;
    public double price;
    public int quantity;

}
