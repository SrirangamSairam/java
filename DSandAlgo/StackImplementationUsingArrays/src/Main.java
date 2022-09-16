public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
//        myStack.pop();
        System.out.println("stack size is " + myStack.size());
        myStack.push(1);
        System.out.println("stack size is " + myStack.size());
        myStack.pop();
        System.out.println("stack size is " + myStack.size());
//        myStack.pop();
        System.out.println("stack size is " + myStack.size());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("stack size is " + myStack.size());
        myStack.pop();
        System.out.println("stack size is " + myStack.size());
        myStack.pop();
        System.out.println("stack size is " + myStack.size());
        System.out.println(myStack.peek());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("stack size is " + myStack.size());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("stack size is " + myStack.size());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("stack size is " + myStack.size());
        myStack.push(1);
        System.out.println("stack size is " + myStack.size());
        myStack.push(2);
        System.out.println("stack size is " + myStack.size());
        myStack.push(3);
        System.out.println("stack size is " + myStack.size());
        System.out.println("Hello world!");
    }
}