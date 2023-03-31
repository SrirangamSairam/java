package com.sai;

public class MyWork implements Runnable{

    public static int count = 0;
    private int num;

    private int sum=1;
    public MyWork(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            for (int j=0;j<100;j++) {
                sum++;
            }
        }
        countInc();
        System.out.println("Hello from , " + Thread.currentThread().getName()+" , number is "+num+" , count is "+count);
    }
    public static synchronized void countInc() {
        count++;
    }
}
