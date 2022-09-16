public class MyStack {
    private int[] myStack;
    private int capacity;
    private int top;
    public MyStack(int length) {
        this.capacity = length;
        this.myStack = new int[length];
        this.top = -1;
    }
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full and can't add new elements:(");
            System.exit(-1);
        }
        System.out.println("Inserting " + data);
        this.myStack[++top] = data;
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty and there's nothing to delete");
            System.exit(-1);
        }
        System.out.println("Deleting " + peek());
        return this.myStack[top--];
    }
    public int peek() {
        if(!isEmpty())
            return this.myStack[top];
        else
            System.exit(-1);
        return -1;
    }
    public boolean isFull() {
        return top == capacity -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
}
