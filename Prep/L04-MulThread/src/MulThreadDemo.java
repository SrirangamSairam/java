import com.sai.MyWork;

public class MulThreadDemo {
    public static void main(String[] args) {
        System.out.println("Hello from main thread "+Thread.currentThread().getName());
        MyThread2 myThread1 = new MyThread2();
        myThread1.start();
        MyThread myThread4 = new MyThread();
        myThread4.start();
        MyThread myThread7 = new MyThread();
        myThread7.start();
        Thread thread = new Thread(new MyWork(1));
        thread.start();
        try {
            myThread7.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of main thread");
    }
}
