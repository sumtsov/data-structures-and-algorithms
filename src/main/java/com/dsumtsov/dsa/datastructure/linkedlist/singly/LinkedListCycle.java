package com.dsumtsov.dsa.datastructure.linkedlist.singly;

public class LinkedListCycle {

    /**
     * Checks if there is a cycle in the linked list
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the node the cycle begins
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head) {
        boolean isCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (isCycle) {
            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
        return null;
    }
}