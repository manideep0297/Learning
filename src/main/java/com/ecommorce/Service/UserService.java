package com.ecommorce.Service;

import com.ecommorce.Entity.Products;
import com.ecommorce.Entity.User;
import com.ecommorce.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public ProductService productService;

    @Autowired
    public UserDAO userDAO;

    public User createUser(User user){
        User user1 = userDAO.save(user);
        return user1;
    }

    public User Verifyuser(int u_id){
        User user = userDAO.findById(u_id);
        return user;
    }

    public List<Products> userproducts(ProductService productService){
        List<Products> productService1 = productService.listofproducts();
        return productService1;
    }
}
