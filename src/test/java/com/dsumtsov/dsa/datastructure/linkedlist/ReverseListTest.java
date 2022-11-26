package com.dsumtsov.dsa.datastructure.linkedlist;

import com.dsumtsov.dsa.datastructure.linkedlist.singly.ListNode;
import com.dsumtsov.dsa.datastructure.linkedlist.singly.ReverseList;
import org.junit.jupiter.api.Test;

public class ReverseListTest {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseList.reverseList(node1);
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseList.reverseListV2(node1);
    }
}
