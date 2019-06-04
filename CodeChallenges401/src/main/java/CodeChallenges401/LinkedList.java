package CodeChallenges401;

import java.util.ArrayList;

public class LinkedList {
    private Node head;
    private Node tail;

    // Instantiate new empty linked list
    public void LinkdedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert new node at the front of the linked list
    public void insert(int value) {
        Node newNode = new Node(value);

        newNode.next = this.head;
        if (this.head == null)
            this.tail = newNode;
        this.head = newNode;
    }

    // Check if the linked list contains value
    public boolean includes(int value) {
        Node walker = this.head;

        while (walker != null && walker.value != value)
            walker = walker.next;
        return walker != null;
    }

    // Override toString method to return the string representation of the linked list
    @Override public String toString() {
        Node walker = this.head;
        StringBuilder output = new StringBuilder("[");

        while (walker != null && walker.next != null) {
            output.append(walker.value);
            output.append(", ");
            walker = walker.next;
        }
        if (walker != null) {
            output.append(walker.value);
        }
        output.append("]");
        return output.toString();
    }

    // Displays to screen the string representation of the linked list
    public void print() {
        System.out.println(this.toString());
    }

    // Linked list node class
    private class Node {
        private int value;
        private Node next;

        // Constructor
        private Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}