package com.example.L10AOPdemo.AOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {

}
