package com.sai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MulThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        long start = System.currentTimeMillis();
        for(int i=0;i<100;i++) {
            executorService.submit(() -> {
                System.out.println("Hello");
                for (int j=0;j<10;j++) {
                    System.out.println("Inside second loop" + j);
                }
                System.out.println("Hi");
            });
        }
        executorService.shutdownNow();
        while (!executorService.isTerminated()) {
            ;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
