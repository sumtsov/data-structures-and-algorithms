package com.dsumtsov.dsa.datastructure.linkedlist;

import com.dsumtsov.dsa.datastructure.linkedlist.singly.SinglyLinkedListSentinel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListSentinelTest {

    @Test
    public void testCase1() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        int val1 = list.get(1);
        list.deleteAtIndex(1);
        int val2 = list.get(1);

        Assertions.assertEquals(2, val1);
        Assertions.assertEquals(3, val2);
    }

    @Test
    public void testCase2() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addAtHead(7); // 7
        list.addAtHead(2); // 2 7
        list.addAtHead(1); // 1 2 7
        list.addAtIndex(3, 0); // 1 2 7 0
        list.deleteAtIndex(2); // 1 2 0
        list.addAtHead(6); // 6 1 2 0
        list.addAtTail(4); // 6 1 2 0 4
        int val = list.get(4);
        list.addAtHead(4);
        list.addAtIndex(5, 0);
        list.addAtHead(6);

        Assertions.assertEquals(4, val);
    }
    /**
     *  Input:
       ["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
       [[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]

       Expected answer:
       [null,null,null,null,null,null,null,null,4,null,null,null]
    * */

    @Test
    public void testCase3() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addAtTail(1);
        int val = list.get(0);

        Assertions.assertEquals(1, val);
    }

    @Test
    public void testCase4() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addAtHead(1); // 1
        list.addAtTail(3); // 1 3
        list.addAtIndex(1, 2); // 1 2 3
        int val1 = list.get(1); // val == 2
        list.deleteAtIndex(1); // 1 3
        int val2 = list.get(1); // val == 3
        int val3 = list.get(3); // val == -1
        list.deleteAtIndex(3); //
        list.deleteAtIndex(0); // 3
        int val4 = list.get(0); // val == 3
        list.deleteAtIndex(0); // empty list
        int val5 = list.get(0); // val == -1

        Assertions.assertEquals(2, val1);
        Assertions.assertEquals(3, val2);
        Assertions.assertEquals(-1, val3);
        Assertions.assertEquals(3, val4);
        Assertions.assertEquals(-1, val5);
    }

    /**
     * Input:
     * ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex","deleteAtIndex","get","deleteAtIndex","get"]
     * [[],[1],[3],[1,2],[1],[1],[1],[3],[3],[0],[0],[0],[0]]
     */

    @Test
    public void testCase5() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addAtHead(1); // 1
        list.addAtTail(3); // 1 3
        list.addAtHead(2); // 2 1 3
        list.addAtIndex(2, 8); // 2 1 8 3
        list.addAtIndex(4, 7); // 2 1 8 3 7
        list.get(3);
        list.deleteAtIndex(0); // 1 8 3 7
        list.deleteAtIndex(4); // 1 8 3 7
        list.deleteAtIndex(3); // 1 8 3
        int val = list.get(2);

        Assertions.assertEquals(3, val);
    }
}
