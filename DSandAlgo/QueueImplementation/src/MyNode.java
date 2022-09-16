public class MyNode {
    private int value;
    private MyNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode(int value) {
        this.value = value;
        this.next = null;
    }
}
