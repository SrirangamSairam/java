package com.example.springbootmvcannotations.controllers;

import com.example.springbootmvcannotations.models.Product;
import com.example.springbootmvcannotations.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class WebController {
    private ProductService productService;

    public WebController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/menu")
    public ModelAndView getMenu() {
        ModelAndView modelAndView = new ModelAndView("dynamic-menu.html");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        modelAndView.getModelMap().put("serverTime", simpleDateFormat.format(new Date()));
        modelAndView.getModelMap().put("products", productService.getProducts());
        return modelAndView;
    }

    @GetMapping("/productList")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
}
