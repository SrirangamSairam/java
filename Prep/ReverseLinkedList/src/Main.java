public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode listNode = reverseList(node1);
        while (listNode!=null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
//        if(head == null) return null;
//        Stack<Integer> stack = new Stack<>();
//        while (head!=null) {
//            stack.add(head.val);
//            head = head.next;
//        }
//        ListNode node = new ListNode(stack.pop());
//        ListNode headNode = node;
//        while (!stack.isEmpty()) {
//            node.next = new ListNode(stack.pop());
//            node = node.next;
//        }
//        return headNode;

        ListNode prev = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}