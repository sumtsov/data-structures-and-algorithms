package com.dsumtsov.dsa.datastructure.linkedlist;

import com.dsumtsov.dsa.datastructure.linkedlist.singly.ListNode;
import com.dsumtsov.dsa.datastructure.linkedlist.singly.ReverseListBetween;
import org.junit.jupiter.api.Test;

public class ReverseListBetweenTest {

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseListBetween.reverseBetween(node1, 2, 4);
    }
}
