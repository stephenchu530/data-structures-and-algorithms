package CodeChallenges401;

import java.util.ArrayList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Instantiate new empty linked list
    public void DoublyLinkdedList() {
        head = null;
        tail = null;
    }

    // Insert new node
    public Node insert(int value) {
        Node newNode;

        try {
            newNode = new Node(value, head);
        } catch (Exception e) {
            // Ignore and return null
            return null;
        }
        if (tail == null) {
            tail = newNode;
        }
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return newNode;
    }

    // Check if the linked list contains value
    public boolean includes(int value) {
        boolean found = false;
        Node walker = head;

        while ((walker != null) &&
                !(found = walker.value == value)) {
            walker = walker.next;
        }
        return found;
    }

    // Returns a list of all the values in the doubly linked list
    // in the forward direction (head to tail)
    public ArrayList<Integer> forwardPrint() {
        Node walker = head;
        ArrayList<Integer> output = new ArrayList<>();

        while (walker != null) {
            output.add(walker.value);
            walker = walker.next;
        }
        return output;
    }

    // Returns a list of all the values in the doubly linked list
    // in the backward direction (tail to head)
    public ArrayList<Integer> backwardPrint() {
        Node walker = tail;
        ArrayList<Integer> output = new ArrayList<>();

        while (walker != null) {
            output.add(walker.value);
            walker = walker.prev;
        }
        return output;
    }

    // Doubly Linked list node class
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        // Constructor
        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = null;
        }
    }
}

