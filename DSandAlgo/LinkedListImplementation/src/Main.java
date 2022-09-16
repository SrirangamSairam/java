public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.printList();
//        myLinkedList.delete(4);
//        myLinkedList.printList();
//        myLinkedList.insert(2,10);
//        myLinkedList.printList();
//        myLinkedList.insert(0,1);
//        myLinkedList.printList();
//        myLinkedList.insert(7,100);
//        myLinkedList.printList();
//        myLinkedList.append(60);
//        myLinkedList.printList();
//        myLinkedList.delete(40);
//        myLinkedList.printList();
//        myLinkedList.delete(10);
//        myLinkedList.printList();
//        myLinkedList.insert(7,100);
//        myLinkedList.printList();
//        myLinkedList.append(6);
//        myLinkedList.printList();
//        myLinkedList.append(6);
//        myLinkedList.printList();
//        myLinkedList.insert(7,100);
//        myLinkedList.printList();
        //myLinkedList.prepend(200);
        //myLinkedList.prepend(300);
        //myLinkedList.printList();
        myLinkedList.reverseList();
        myLinkedList.printList();
        System.out.println("Hello world!");
    }
}