public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;
    public ListItem(Object value) {
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setNext(ListItem rightLink);
    abstract ListItem setPrevious(ListItem leftLink);
    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
