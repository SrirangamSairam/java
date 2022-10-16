package com.sai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++) {
            executorService.submit(new MyTask(i));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){
            ;
        }
        System.out.println(MyTask.counter);
        System.out.println(MyTask.atomicCounter.get());
    }
}
