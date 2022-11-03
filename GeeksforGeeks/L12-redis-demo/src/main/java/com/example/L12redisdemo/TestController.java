package com.example.L12redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TestController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisTemplate<String, Object> objRedisTemplate;

    @GetMapping
    public ResponseEntity<String> getHello() {
        redisTemplate.opsForValue().set("Current thread name", Thread.currentThread().getName());
        return ResponseEntity.ok("Hello");
    }

    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        long id = objRedisTemplate.opsForValue().increment("person.id");
        person.setId(id);
        String personKey = "person"+id;
        objRedisTemplate.opsForValue().set(personKey,person);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/addPersonToQueue/{id}")
    public ResponseEntity<Person> addPersonToQueue(@PathVariable Long id) {
        Person person = (Person) objRedisTemplate.opsForValue().get("person"+id);
        objRedisTemplate.opsForList().leftPush("Person List", person);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/removePersonFromQueue")
    public ResponseEntity<Person> processPersonQueue() {
        Person person = (Person) objRedisTemplate.opsForList().rightPop("Person List");
        return ResponseEntity.ok(person);
    }
}
