package com.example.springbootmvcannotations.services;

import com.example.springbootmvcannotations.models.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Value("${initial.keyword}")
    private String initialKeyword;
    static int nextId = 1;
    static List<Product> productList;

    @PostConstruct
    public void initProduct() {
        productList = new ArrayList<>();
        productList.add(new Product("Laptop",150000));
        productList.add(new Product("Mobile",15000));
        productList.add(new Product("USB",1500));
    }

    public void addProduct(Product product) {
        product.setId(nextId);
        nextId++;
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    public List<Product> getProductsByName(String name) {
        List<Product> resultList = new ArrayList<>();
        for (Product product: productList) {
            if(product.getName().equals(name)) {
                resultList.add(product);
            }
        }
        return resultList;
    }

    public Product getProductById(int id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
