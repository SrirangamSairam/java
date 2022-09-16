public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.start();
        Thread t1 = new Thread(new Test1());
        t1.start();
        for (int i=0;i<5;i++) {
            System.out.println("Hello world!");
            Thread.sleep(1);
        }
    }
}

class Test extends Thread {
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Inside Test class");
        }
    }
}

class Test1 implements Runnable {
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Inside Test1 class");
        }
    }
}