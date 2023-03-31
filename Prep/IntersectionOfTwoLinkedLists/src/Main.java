public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        ListNode node8 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node6.next = node7;
        node7.next = node8;
        node8.next = node3;
        ListNode answer = getIntersectionNode(node1,node6);
        if(answer!=null) System.out.println(answer.val);
    }

//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode node1 = headA;
//        ListNode node2 = headB;
//        while(node1 != null) {
//            while (node2 != null) {
//                if(node1 == node2) {
//                    return node2;
//                }
//                node2 = node2.next;
//            }
//            node2 = headB;
//            node1 = node1.next;
//        }
//        return null;
//    } //O(m*n) //not good

//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> set = new HashSet<>();
//        ListNode node1 = headA;
//        ListNode node2 = headB;
//        while (node1!=null) {
//            set.add(node1);
//            node1 = node1.next;
//        }
//        while (node2!=null) {
//            if(set.contains(node2)) return node2;
//            node2 = node2.next;
//        }
//        return null; //O(m+n) but space is O(m) or O(n)
//    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1!=node2) {
            node1 = node1==null?headB:node1.next;
            node2 = node2==null?headA:node2.next;
        }
        return node1;
    } //O(m+n) and space is O(1)

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}