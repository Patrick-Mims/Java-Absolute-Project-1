package com.sfsu.app;

public class LLIST {
    // To avoid memory leaks (if the inner class will be held for a longer time than the outer), make it a static inner class.
    // An Inner Class can be private and cannot be accessed from an object outside the class.
    // A Static Inner Class it can be accessed without instantiating the outer class.
    static class Node {
        private int item;
        private Node next;
        public Node() {
            this.item = 0;
            this.next = null;
        }
        public Node(int newItem, Node nextNode) {
            this.item = newItem;
            this.next = nextNode;
        }
        public int getItem() {
            return item;
        }
        public Node getNext() {
            return next;
        }
    }
    private Node head;
    public LLIST() {
        this.head = null;
    }
    public void add(int itemName) {
        this.head = new Node(itemName, head);
    }
    public boolean deleteHeadNode() {
        if(this.head != null) {
            this.head = this.head.next;
            return true;
        }
        return false;
    }
}