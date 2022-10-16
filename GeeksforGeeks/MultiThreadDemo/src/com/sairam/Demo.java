package com.sairam;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello from " + Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        thread1.start();
//        thread1.join();
        MyThread thread2 = new MyThread();
        thread2.start();
        thread2.join();
        Thread thread3 = new Thread(new MyWork());
        thread3.start();
        System.out.println("End of main thread");
    }
}
