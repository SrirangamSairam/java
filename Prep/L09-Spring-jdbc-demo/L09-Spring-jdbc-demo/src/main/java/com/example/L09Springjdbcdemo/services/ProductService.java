package com.example.L09Springjdbcdemo.services;

import com.example.L09Springjdbcdemo.dao.ProductDao;
import com.example.L09Springjdbcdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product createProduct(Product product) {
        return productDao.createProduct(product);
    }

    public List<Product> getProductsByName(String name) {
        return productDao.getProductsByName(name);
    }
}
