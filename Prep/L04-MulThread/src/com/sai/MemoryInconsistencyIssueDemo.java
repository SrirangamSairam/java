package com.sai;

public class MemoryInconsistencyIssueDemo {
    public static void main(String[] args) {
        MyThread sender = new MyThread("S");
        Thread thread1 = new Thread(sender);
        Thread thread2 = new Thread(new MyThread("R"));
        thread2.start();
        thread1.start();
    }

}

class MyThread implements Runnable {

    private static volatile int val;
    private String type;

    public MyThread(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        if(type.equals("R")) {
            while (val!=-1) {
                System.out.println("val in thread "+Thread.currentThread().getName()+" is :"+val);
                val++;
            }
        }else {
            for (int i=0;i<1000;i++) {
                ;
            }
            val = -1;
            System.out.println("Setting val to -1 in "+ Thread.currentThread().getName());
        }
    }
}
