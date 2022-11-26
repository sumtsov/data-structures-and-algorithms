package com.dsumtsov.dsa.datastructure.linkedlist;

import com.dsumtsov.dsa.datastructure.linkedlist.singly.ListNode;
import com.dsumtsov.dsa.datastructure.linkedlist.singly.RemoveNthFromEnd;
import org.junit.jupiter.api.Test;

public class RemoveNthFromEndTest {

    @Test
    public void testCase1() {
        ListNode head = new ListNode(5);
        ListNode result = RemoveNthFromEnd.removeNthFromEnd(head, 4);
    }
}
