public class MyStack {
    MyNode top;
    int length = 0;
    public MyStack push(int data) {
        MyNode newNode = new MyNode(data);
        if(this.top == null) {
            this.top = newNode;
        } else {
            MyNode currNode = this.top;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
        }
        System.out.println("Added " + data + " to the top");
        this.length++;
        return this;
    }
    public MyStack pop() {
        MyNode currNode = this.top;
        while (currNode.getNext() != null) {
            MyNode nextNode = currNode.getNext();
            if(nextNode.getNext() == null) {
                currNode.setNext(null);
            } else {
                currNode = currNode.getNext();
            }
        }
        System.out.println("Top Element is removed");
        this.length--;
        return this;
    }
    public void peek() {
        MyNode currNode = this.top;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
        }
        System.out.println("Top element of stack is " + currNode.getData());
    }
    public void printStack() {
        MyNode currNode = this.top;
        while (currNode != null) {
            System.out.print(currNode.getData() + " ");
            currNode = currNode.getNext();
        }
        System.out.println();
    }
}
