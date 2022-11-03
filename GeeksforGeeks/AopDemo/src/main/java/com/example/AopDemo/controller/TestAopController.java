package com.example.AopDemo.controller;

import com.example.AopDemo.aop.LogExecutionTime;
import com.example.AopDemo.service.TestAopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestAopController {

    private static Logger logger = LoggerFactory.getLogger(TestAopController.class);
    @Autowired
    private TestAopService testAopService;

    @LogExecutionTime
    @GetMapping("/aop")
    public String[] testAop() {
        long start = System.currentTimeMillis();
        String[] test = testAopService.testAop();
        long end = System.currentTimeMillis();
        logger.info("Execution Time is {}", end-start);
        return test;
    }
}
