public class MyThread2 extends Thread{
    public void run() {
        int sum = 0;
        for(int i=1;i<1000000;i++) {
            sum+=i;
        }
        System.out.println(sum+" thread name is "+ Thread.currentThread().getName()+" from class "+ this.getClass().getName());
    }
}
