public class Nodes {
    private int value;
    private Nodes next;
    private Nodes prev;

    public Nodes getPrev() {
        return prev;
    }

    public void setPrev(Nodes prev) {
        this.prev = prev;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Nodes getNext() {
        return next;
    }

    public Nodes(int data) {
        this.value = data;
        this.next = null;
        this.prev = null;
    }
}
