package com.sairam;

public class MyWork implements Runnable{
    public void run() {
        System.out.println("In work class and thread name is " + Thread.currentThread().getName());
    }
}
