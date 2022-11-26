package com.dsumtsov.dsa.datastructure.linkedlist.singly;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (n < 0 || head == null) {
            return head;
        }

        ListNode tail = head;
        int size = 0;

        while (tail != null) {
            tail = tail.next;
            size++;
        }

        int index = size - n;

        if (index == 0) {
            return head.next;
        }

        if (index < 0) {
            return head;
        }

        ListNode prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return head;
    }

    /**
     *         // corner case
     *         if (n <= 0 || head == null) { return head; }
     *
     *         // create a sentinel node
     *         ListNode sentinel = new ListNode(-1);
     *         sentinel.next = head;
     *
     *         // create a pointer to head
     *         ListNode p = head;
     *
     *         // get the length of the given list
     *         int len = 0;
     *         while (p != null) {
     *             len++;
     *             p = p.next;
     *         }
     *
     *         p = sentinel;
     *         for (int i = 0; i < len - n; i++) {
     *             p = p.next;
     *         }
     *
     *         p.next = p.next.next;
     *
     *         return sentinel.next;
     *     }
     */
}
