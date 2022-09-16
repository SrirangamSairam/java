public class MyLinkedList {
    private Nodes head;

    public Nodes getHead() {
        return head;
    }

    public void setHead(Nodes head) {
        this.head = head;
    }

    public MyLinkedList append(int data) {
        Nodes newNode = new Nodes(data);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Nodes currNode = this.head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
            newNode.setPrev(currNode);
        }
        return this;
    }

    public MyLinkedList prepend(int data) {
        Nodes newNode = new Nodes(data);
        if(this.head == null) this.head = newNode;
        else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
        }
        return this;
    }

    public MyLinkedList insert(int index, int data) {
        Nodes node = new Nodes(data);
        Nodes currNode = this.head, prev = null;
        while (currNode != null && index != 0) {
            prev = currNode;
            currNode = currNode.getNext();
            index--;
        }
//        if(currNode == null) {
//            System.out.println(data + " cannot be inserted as it exceeds the length of list");
//        }
//        if(index == 0) {
            if (prev != null) {
                prev.setNext(node);
                node.setPrev(prev);
                node.setNext(currNode);
            } else {
                this.head = node;
                this.head.setNext(currNode);
                if (currNode != null) {
                    currNode.setPrev(this.head);
                }
            }
//        }
        return this;
    }

    public void printList() {
        Nodes node = this.head;
        while (node != null) {
            System.out.println(node.getValue()+" ");
            node = node.getNext();
        }
        System.out.println();
    }

    public MyLinkedList delete(int data) {
        Nodes node = this.head, prev = null;
        if (node != null && node.getValue() == data) {
            this.head = node.getNext();
            this.head.setPrev(null);
            System.out.println(data + " found and deleted");
            return this;
        }
        while(node != null && node.getValue() != data) {
            prev = node;
            node = node.getNext();
        }
        if (node != null) {
            if (prev != null) {
                prev.setNext(node.getNext());
                node.getNext().setPrev(prev);
                System.out.println(data + " found and deleted");
            }
        }
        if (node == null) {
            // means data is not found in the list
            System.out.println(data + " not found");
        }
        return this;
    }

    public MyLinkedList reverseList() {
        Nodes currNode = this.head;
        while (currNode != null){
            int data = currNode.getValue();
            Nodes nextNode = currNode.getNext();
            currNode.setNext(null);
            currNode = nextNode;
            insert(0,data);
        }
        return this;
    }
}