package com.sai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,8,0L, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>(3));
        for (int i=0;i<20;i++) {
            executorService.submit(new MyTask(i));
        }
        executorService.shutdown();
    }
}
