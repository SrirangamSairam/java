public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(isPalindrome(node1));
    }

    public static boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow!=null) {
            if (slow.val!= fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode slow) {
        ListNode prev = null;
        ListNode currNode = slow;
        while (currNode!=null) {
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

//    public static boolean isPalindrome(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        ListNode node = head;
//        while(node!=null) {
//            stack.add(node.val);
//            node = node.next;
//        }
//        while(head!=null) {
//            if(head.val != stack.pop()) return false;
//            head = head.next;
//        }
//        return true;
//    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}