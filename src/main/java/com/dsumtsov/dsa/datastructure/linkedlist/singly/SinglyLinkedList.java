package com.dsumtsov.dsa.datastructure.linkedlist.singly;

// TODO: optimize addAtHead, addAtTail
public class SinglyLinkedList {

    ListNode head;
    int size;

    public SinglyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            return -1;
        }
        ListNode result = this.head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.val;
    }

    public void addAtHead(int val) {
        if (val > 1000) {
            return;
        }
        if (this.size == 0) {
            this.head = new ListNode(val);
        } else {
            ListNode node = new ListNode(val);
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addAtTail(int val) {
        if (val > 1000) {
            return;
        }
        if (this.size == 0) {
            this.head = new ListNode(val);
        } else {
            ListNode tail = this.head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = new ListNode(val);
        }
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || val > 1000 || index > this.size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == this.size) {
            addAtTail(val);
            return;
        }
        ListNode prev = this.head;
        for (int i = 0; i < index-1; i++) {
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
        if (index == 0) {
            this.head = this.head.next;
        } else {
            ListNode prev = this.head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        this.size--;
    }
}
