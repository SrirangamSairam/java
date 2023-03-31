package com.example.L12springredis;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private long id;
    private String name;
}
