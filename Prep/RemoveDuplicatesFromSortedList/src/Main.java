public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        ListNode node = deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null) {
            if(list.next == null) break;
            if(list.val == list.next.val) {
                list.next = list.next.next;
            }else
                list = list.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
