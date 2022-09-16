public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printStack();
        myStack.peek();
        myStack.pop();
        myStack.pop();
        myStack.peek();
        myStack.printStack();
        myStack.push(4);
        myStack.push(5);
        myStack.printStack();
        myStack.peek();
        System.out.println("Hello world!");
    }
}