package com.example.L10AOPdemo.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    private static Logger logger = LoggerFactory.getLogger(ExecutionTimeAspect.class);

    @Around("@annotation(com.example.L10AOPdemo.AOP.LogExecutionTime)")
    public Object log(ProceedingJoinPoint point) {
        long start = System.currentTimeMillis();
        Object result = null;
        try {
            result = point.proceed();
            long time = System.currentTimeMillis() - start;
            logger.error("className={}, methodName={}, arguments={}, timeMs={}", ((MethodSignature) (MethodSignature) point.getSignature()).getDeclaringTypeName(), ((MethodSignature) (MethodSignature) point.getSignature()).getMethod().getName(), point.getArgs(), time);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }
}
