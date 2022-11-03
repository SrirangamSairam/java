package com.example.AopDemo.service;

import org.springframework.stereotype.Service;

@Service
public class TestAopService {

//    @LogExecutionTime
    public String[] testAop() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] arr = new String[2];
        arr[0] = "Hello";
        arr[1] = "Hi";
        return arr;
    }
}
