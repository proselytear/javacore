package ua.epam.javacore.lesson_05;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode n = dummy;
        while (n.next != null) {
            if (n.next.val == val) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
//    public ListNode removeElements(ListNode head, int val) {