package com.commerce.testdev.DTO;


import com.commerce.testdev.Entity.Product;

public class FakeStoreApiDTO {
    private int id;
    private String name;
    private String description;
    private String category;
    //private String image;

    public FakeStoreApiDTO() {}

    //method
    public Product toProduct(FakeStoreApiDTO fakeStoreApiDTO){
        Product product = new Product();
        product.setId(fakeStoreApiDTO.getId());
        product.setCategory(fakeStoreApiDTO.getCategory());
        product.setDescription(fakeStoreApiDTO.getDescription());
        //product.setImage(fakeStoreApiDTO.getImage());
        product.setTitle(fakeStoreApiDTO.getName());

        return product;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
}
