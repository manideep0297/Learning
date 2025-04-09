package com.ecommorce.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int cid;
    public String cname;

    @OneToMany(mappedBy = "category",cascade =CascadeType.ALL)
    @JsonIgnore
    public List<Products> products;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

//    public List<Products> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Products> products) {
//        this.products = products;
//    }
}

/*

serialization -> if u want to ignore while serialization - jsonBackreference
                 if u want to serialize - jsonManagedReference

bidirectional


Jackson - Java object -> json it is because of jackson



In java everything is in object -> convert java object to XML, JSON, BinaryStream ==== serialization



 */
