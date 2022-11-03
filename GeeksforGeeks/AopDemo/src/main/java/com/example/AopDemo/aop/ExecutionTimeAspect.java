package com.example.AopDemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {
    private static final Logger logger = LoggerFactory.getLogger(ExecutionTimeAspect.class);
    @Around("@annotation(com.example.AopDemo.aop.LogExecutionTime)")
    public Object log(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = point.proceed();
        long end = System.currentTimeMillis();
        long executionTime = end-start;
        logger.info("Execution time from ExecutionTimeAspect class is {}", executionTime);
        return result;
    }

    @Before("execution(* com.example.AopDemo.controller.TestAopController.*(..))")
    public void beforeMethodExecution() {
        logger.error("Executing before method advice");
    }

    @After("execution(* com.example.AopDemo.controller.TestAopController.*(..))")
    public void afterMethodExecution() {
        logger.warn("Executing after method advice");
    }
}
