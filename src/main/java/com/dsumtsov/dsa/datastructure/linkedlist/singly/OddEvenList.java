package com.dsumtsov.dsa.datastructure.linkedlist.singly;

public class OddEvenList {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while (evenHead != null && evenHead.next != null) {
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = even;
        return head;
    }
}
