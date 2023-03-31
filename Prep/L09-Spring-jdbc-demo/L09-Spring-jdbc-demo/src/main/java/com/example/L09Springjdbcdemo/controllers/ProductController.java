package com.example.L09Springjdbcdemo.controllers;

import com.example.L09Springjdbcdemo.models.Product;
import com.example.L09Springjdbcdemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        product = productService.createProduct(product);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/name")
    public ResponseEntity<List<Product>> getProductsByName(@RequestParam(value = "name") String name) {
        List<Product> products = productService.getProductsByName(name);
        return ResponseEntity.ok(products);
    }
}
