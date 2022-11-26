package com.dsumtsov.dsa.datastructure.linkedlist.singly;

public class LinkedListIntersection {

    /**
     * Returns the node at which the two lists intersect.
     * If the two linked lists have no intersection at all, returns null.
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        while(p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }
}
