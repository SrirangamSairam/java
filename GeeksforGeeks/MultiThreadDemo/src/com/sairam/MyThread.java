package com.sairam;

public class MyThread extends Thread{
    public void run() {
        System.out.println("In thread class and thread name is " + Thread.currentThread().getName());
    }
}
