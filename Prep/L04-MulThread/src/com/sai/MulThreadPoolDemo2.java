package com.sai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MulThreadPoolDemo2 {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,5,0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(3));
        long start = System.currentTimeMillis();
        for(int i=0;i<100;i++) {
            executorService.submit(() -> {
                System.out.println("Hello");
            });
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            ;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
