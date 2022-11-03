package com.example.L12redisdemo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private long id;
    private String name;
}
