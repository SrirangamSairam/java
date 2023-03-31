package com.example.L10AOPdemo;

import com.example.L10AOPdemo.AOP.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @LogExecutionTime
    public String getMessage() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello World" + Thread.currentThread().getName();
    }
}
