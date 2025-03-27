package com.commerce.service;

import com.commerce.DTO.FakeStoreApiDTO;
import com.commerce.Entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreAPIService implements FakeService{

    private RestTemplate restTemplate;

    public FakeStoreAPIService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProduct() {
        return null;
    }

    @Override
    public Product getProduct(int id) {
        FakeStoreApiDTO fakeStoreApiDTO = restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreApiDTO.class);
        Product product = fakeStoreApiDTO.toProduct(fakeStoreApiDTO);
        return product;
    }

    /* DTO
     data transfer objects
     -> it a class we use it to filter few thing to show to user

     DAO - DB


     request -> coming to server
     response -> gng from server

     requestBody -> data coming to server

     we use this in controller
     */
}
