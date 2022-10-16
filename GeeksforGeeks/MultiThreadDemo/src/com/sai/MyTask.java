package com.sai;

import java.util.concurrent.atomic.AtomicInteger;

public class MyTask implements Runnable{

    public static AtomicInteger atomicCounter = new AtomicInteger();
    public static int counter = 0;
    private int num;

    public MyTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Task number "+ num + " is executed by thread name " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter++;
        atomicCounter.incrementAndGet();
        System.out.println("Counter value now is " + counter);
        System.out.println("Atomic Counter value now is " + atomicCounter.get());
    }
}
