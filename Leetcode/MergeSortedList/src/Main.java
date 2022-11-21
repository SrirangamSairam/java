public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode listNode = new ListNode();
//        ListNode list1 = (ListNode) Arrays.asList(1,2,4);
//        ListNode list2 = (ListNode) Arrays.asList(1,3,4);
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list1.next = list2;
        ListNode list4 = new ListNode(1);
        ListNode list5 = new ListNode(3);
        list5.next = new ListNode(4);
        list4.next = list5;
        listNode = mergeTwoLists(list1, list4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }



    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode head = result;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        if(list1 != null) {
            result.next = list1;
        }
        if(list2 != null) {
            result.next = list2;
        }
        return head.next;
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}