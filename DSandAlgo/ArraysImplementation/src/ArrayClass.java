public class ArrayClass {
    private int length;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private Object[] data;
    public ArrayClass() {
        this.length = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.data = new Object[capacity];
    }

    public Object get(int index) {
        return this.data[index];
    }

    public int push(String item) {
        this.data[this.length] = item;
        this.length++;
        this.capacity++;
        return this.length;
    }

    public Object pop() {
        Object deletedItem = this.data[this.length-1];
        this.data[this.length-1] = null;
        this.length--;
        this.capacity--;
        return deletedItem;
    }
}
