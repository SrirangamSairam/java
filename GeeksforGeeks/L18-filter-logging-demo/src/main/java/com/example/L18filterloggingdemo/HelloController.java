package com.example.L18filterloggingdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("test")
    public ResponseEntity<String> getHello(@RequestParam String username) {
        return ResponseEntity.ok("Hello World!");
    }
}
