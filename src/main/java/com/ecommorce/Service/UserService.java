package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import com.ecommorce.Entity.User;
import com.ecommorce.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User user;

    @Autowired
    public ProductService productService;
    @Autowired
    public UserDAO userDAO;

    public User createuser(User user){
        User user1 = userDAO.save();
        return user1;
    }

    public  User Verifyuser(int uid){
        User user2 = userDAO.findById(uid);
        return user2;
    }

    public List<Products> userproducts(ProductService productService){
        List<Products> productService1 = productService.listofproducts();
        return productService1;
    }
}
