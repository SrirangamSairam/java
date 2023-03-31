package com.sai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i =0;i<100;i++) {
            executorService.submit(new MyWork(i+1));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            ;
        }
        System.out.println(MyWork.count);
    }
}
