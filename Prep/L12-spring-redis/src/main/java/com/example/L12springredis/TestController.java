package com.example.L12springredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisTemplate<String, Product> productRedisTemplate;

//    @GetMapping
//    public String getHello() {
//        redisTemplate.opsForValue().set("Hello Message","Hello World");
//        return redisTemplate.opsForValue().get("Hello Message");
//    }
    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        long id = productRedisTemplate.opsForValue().increment("product.id");
        product.setId(id);
        String key = "product:"+product.getId();
        productRedisTemplate.opsForValue().set(key,product);
        return product;
    }
}
