package com.dsumtsov.dsa.datastructure.linkedlist.singly;

/**
 * https://leetcode.com/problems/design-linked-list/solution/
 */
public class SinglyLinkedListSentinel {

    ListNode head;
    int size;

    public SinglyLinkedListSentinel() {
        this.size = 0;
        this.head = new ListNode(0); // sentinel node as pseudo-head
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            return -1;
        }
        ListNode result = this.head;
        for (int i = 0; i < index + 1; i++) {
            result = result.next;
        }
        return result.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || val > 1000 || index > this.size) {
            return;
        }
        ListNode prev = this.head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        ListNode cur = new ListNode(val);
        cur.next = prev.next;
        prev.next = cur;
        this.size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            return;
        }

        ListNode prev = this.head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        this.size--;
    }
}
