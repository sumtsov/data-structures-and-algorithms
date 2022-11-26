package com.dsumtsov.dsa.datastructure.linkedlist.singly;

public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        ListNode currentHead = head;
        while (head.next != null) {
            ListNode p = head.next;
            head.next = p.next;
            p.next = currentHead;
            currentHead = p;
        }
        return currentHead;
    }

    public static ListNode reverseListV2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
