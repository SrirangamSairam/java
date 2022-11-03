package com.example.L09springbootdemo.controllers;

import com.example.L09springbootdemo.models.Product;
import com.example.L09springbootdemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/byname")
    public ResponseEntity<List<Product>> getProductByName(@RequestParam(value = "keyword") String keyword) {
        return ResponseEntity.ok(productService.getProductByName(keyword));
    }

//    @PostMapping("/named")
//    public ResponseEntity<Product> addNamedProduct(@RequestBody Product product) {
//        product = productService.createNamedProduct(product);
//        return ResponseEntity.ok(product);
//    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        product = productService.createProduct(product);
        return ResponseEntity.ok(product);
    }
}
