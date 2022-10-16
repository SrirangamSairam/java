package com.sai;

import java.util.Objects;

public class MemoryConsistencyIssueDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyWorks("S"));
        Thread thread2 = new Thread(new MyWorks("R"));
        thread2.start();
        thread1.start();
    }
}

class MyWorks implements Runnable {

    private static volatile int counter1;
    private String type;

    public MyWorks(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        if(Objects.equals(type, "R")) {
            System.out.println("Before while");
            while(counter1 != -1) {
                System.out.println("counter value in thread "+Thread.currentThread().getName()+" is "+counter1);
                counter1++;
            }
        }else {
            for(int i=0;i<100000;i++) {
                ;
            }
            counter1 = -1;
            System.out.println("Counter value is set to -1");
//            try {
//                Thread.sleep(10);
//                counter = -1;
//                System.out.println("Counter value is set to -1");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
