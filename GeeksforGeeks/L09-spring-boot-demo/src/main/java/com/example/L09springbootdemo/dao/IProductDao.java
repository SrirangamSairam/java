package com.example.L09springbootdemo.dao;

import com.example.L09springbootdemo.models.Product;

import java.util.List;

public interface IProductDao {
    List<Product> getProductsByName(String name);
    Product createProduct(Product product);
}
