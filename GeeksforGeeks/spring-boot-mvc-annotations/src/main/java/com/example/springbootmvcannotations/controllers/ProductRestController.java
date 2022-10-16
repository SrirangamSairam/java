package com.example.springbootmvcannotations.controllers;

import com.example.springbootmvcannotations.models.Product;
import com.example.springbootmvcannotations.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {
    private static Logger logger = LoggerFactory.getLogger(ProductRestController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/productList")
    public List<Product> getProduct() {
        return productService.getProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/byname")
    public List<Product> getProductByName(@RequestParam(value = "keyword") String keyword) {
        return productService.getProductsByName(keyword);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable(value = "id") int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/menu")
    public String getMenu() {
        return "menu.html";
    }
}
