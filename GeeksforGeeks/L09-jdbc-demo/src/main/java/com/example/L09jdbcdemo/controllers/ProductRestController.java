package com.example.L09jdbcdemo.controllers;

import com.example.L09jdbcdemo.models.Product;
import com.example.L09jdbcdemo.services.ProductService;
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

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        product = productService.addProduct(product);
        return product;
    }

    @GetMapping("/byname")
    public List<Product> getProductsByName(@RequestParam(value = "keyword") String keyword) {
        logger.info("Received Keyword {}",keyword);
        return productService.getProductsByName(keyword);
    }
}
