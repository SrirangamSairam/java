public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from MyThread class and thread is "+Thread.currentThread().getName());
    }
}
