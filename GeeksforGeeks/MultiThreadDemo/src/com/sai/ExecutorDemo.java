package com.sai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService fixExecutorService = Executors.newFixedThreadPool(8);
        long start = System.currentTimeMillis();
        for(int i=1;i<=15;i++) {
            fixExecutorService.submit(new MyTask(i));
        }
        fixExecutorService.shutdown();
        while(!fixExecutorService.isTerminated()) {
            ;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
