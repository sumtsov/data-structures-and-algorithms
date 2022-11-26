package com.dsumtsov.dsa.datastructure.linkedlist;

import com.dsumtsov.dsa.datastructure.linkedlist.singly.ListNode;
import com.dsumtsov.dsa.datastructure.linkedlist.singly.OddEvenList;
import org.junit.jupiter.api.Test;

public class OddEvenListTest {

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

        OddEvenList.oddEvenList(node1);

        ListNode head = new ListNode(1);
        ListNode odd = head;
        odd.val = 2;
        System.out.println(head.val);
    }
}
