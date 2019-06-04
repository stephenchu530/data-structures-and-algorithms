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

    // Insert new node
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

    // Returns a list of all the values in the linked list
    public ArrayList<Integer> print() {
        Node walker = head;
        ArrayList<Integer> output = new ArrayList<>();

        while (walker != null) {
            output.add(walker.value);
            walker = walker.next;
        }
        return output;
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