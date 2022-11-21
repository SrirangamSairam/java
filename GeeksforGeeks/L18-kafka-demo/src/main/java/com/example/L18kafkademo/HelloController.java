package com.example.L18kafkademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    private static final String topic = "test-topic";
    @Autowired
    private KafkaTemplate<String, Product> kafkaTemplate;

    @GetMapping
    public ResponseEntity<String> getHello() {
        Product product1 = new Product("Phone", 10000);
        kafkaTemplate.send(topic, product1);
        logger.info("Message pushed to Kafka: {}", product1.getName());
        return ResponseEntity.ok("Hello");
    }
}
