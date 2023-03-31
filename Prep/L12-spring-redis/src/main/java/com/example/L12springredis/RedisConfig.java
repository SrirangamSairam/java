package com.example.L12springredis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String, Product> stringProductRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Product> stringProductRedisTemplate = new RedisTemplate<>();
        stringProductRedisTemplate.setConnectionFactory(redisConnectionFactory);
        stringProductRedisTemplate.setKeySerializer(new StringRedisSerializer());
        stringProductRedisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return stringProductRedisTemplate;
    }
}
