import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class MyStack {

    LinkedList<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.addFirst(x);
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        if(queue.isEmpty()) return -1;
        else return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}