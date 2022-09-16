public class MyQueue {
    private MyNode first;
    private MyNode last;

    public void enqueue(int data) {
        MyNode newNode = new MyNode(data);
        if(this.first == null) {
            first = newNode;
            last = newNode;
        }else {
            MyNode currNode = this.first;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
            last = newNode;
        }
        System.out.println("Inserted " + data + " to the queue");
    }
    public void dequeue() {
        if(this.first == null) {
            System.out.println("There is nothing to delete from queue");
        } else {
            this.first = this.first.getNext();
            System.out.println("Deleted the first element from queue");
        }
    }
    public void peek() {
        if(this.first == null) {
            System.out.println("There is nothing in queue");
        } else {
            System.out.println(this.first.getValue());
        }
    }
}
