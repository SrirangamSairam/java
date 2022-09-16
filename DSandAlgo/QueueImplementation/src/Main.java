public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.peek();
        myQueue.dequeue();
        myQueue.enqueue(1);
        myQueue.peek();
        myQueue.enqueue(2);
        myQueue.peek();
        myQueue.enqueue(3);
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();
        System.out.println("Hello world!");
    }
}