package com.example.AopDemo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}
