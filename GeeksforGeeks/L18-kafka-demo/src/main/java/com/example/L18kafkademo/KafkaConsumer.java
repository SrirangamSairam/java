package com.example.L18kafkademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@Configuration
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    private static final String topic = "test-topic";

    @KafkaListener(topics = topic, groupId = "test-consumer-group")
    public void consumeFromKafka(Object payload) {
        LOGGER.info("Data from Kafka: {}", payload);
    }
}
