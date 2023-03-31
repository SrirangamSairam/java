public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode listNode = removeElements(node1,1);
        while (listNode!=null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

//    public static ListNode removeElements(ListNode head, int val) {
//        if(head == null) return null;
//        head.next = removeElements(head.next, val);
//        return head.val==val ? head.next : head;
//    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prevNode = dummyNode;
        while (prevNode.next != null) {
            if(prevNode.next.val == val) {
                prevNode.next = prevNode.next.next;
            }
            else
                prevNode = prevNode.next;
        }
        return dummyNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}