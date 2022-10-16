package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello user " + Thread.currentThread().getName();
    }

    @PostMapping()
    public void hello2() {
        System.out.println("test");
    }
}
