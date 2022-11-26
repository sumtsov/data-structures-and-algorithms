package com.dsumtsov.dsa.datastructure.linkedlist;

import com.dsumtsov.dsa.datastructure.linkedlist.singly.ListNode;
import com.dsumtsov.dsa.datastructure.linkedlist.singly.PalindromeLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Assertions.assertFalse(PalindromeLinkedList.isPalindrome(node1));

        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(1);

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        Assertions.assertTrue(PalindromeLinkedList.isPalindrome(node5));
    }
}
