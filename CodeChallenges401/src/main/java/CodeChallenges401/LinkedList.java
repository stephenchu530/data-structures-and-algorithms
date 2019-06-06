package CodeChallenges401;

import sun.awt.image.ImageWatched;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    // Instantiate new empty linked list
    public void LinkdedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert new node at the front of the linked list
    public void insert(int value) {
        Node newNode = new Node(value);

        newNode.next = this.head;
        if (this.head == null)
            this.tail = newNode;
        this.head = newNode;
        this.size++;
    }

    // Add a new node to the end of the linked list
    public void append(int value) {
        Node newNode = new Node(value);

        if (this.tail == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    // Check if the linked list contains value
    public boolean includes(int value) {
        Node walker = this.head;

        while (walker != null && walker.value != value)
            walker = walker.next;
        return walker != null;
    }

    // Add a new node before a given target
    public void insertBefore(int target, int value) {
        if (!this.includes(target)) {
            throw new IllegalArgumentException("Target value not found!");
        }

        Node walker = this.head;
        if (walker.value == target) {
            this.insert(value);
        } else {
            while (walker.next.value != target) {
                walker = walker.next;
            }
            Node newNode = new Node(value);
            newNode.next = walker.next;
            walker.next = newNode;
        }
        this.size++;
    }

    // Add a new node after a given target
    public void insertAfter(int target, int value) {
        if (!this.includes(target)) {
            throw new IllegalArgumentException("Target value not found!");
        }
        Node walker = this.head;
        if (this.tail.value == target) {
            this.append(value);
        } else {
            while (walker.value != target) {
                walker = walker.next;
            }
            Node newNode = new Node(value);
            newNode.next = walker.next;
            walker.next = newNode;
        }
        this.size++;
    }

    // Return node value at kth position from end of linked list
    public int kthFromEnd(int kth) {
        if (this.size == 0 || kth < 0 || kth >= this.size) {
            throw new IllegalAccessError("Node does not exist!");
        }
        Node walker = this.head;
        for (int i = 0; i < this.size - kth - 1; i++) {
            walker = walker.next;
        }
        return walker.value;
    }

    // Return the node value of the middle node in the linked list
    public int findMiddle() {
        if (this.size == 0) {
            throw new IllegalStateException("Empty linked list!");
        }

        return this.kthFromEnd(this.size/2);
    }

    // Zips two linked lists into one
    public static LinkedList mergeLists(LinkedList list1, LinkedList list2) {
        Node walker1 = list1.getHead(), walker2 = list2.getHead();
        Node tmp1, tmp2;

        if (walker1 == null) return list2;
        if (walker2 == null) return list1;

        while (true) {
            tmp1 = walker1.next;
            tmp2 = walker2.next;
            walker1.next = walker2;
            walker1 = tmp1;
            if (walker1 == null) break;
            walker2.next = walker1;
            walker2 = tmp2;
            if (walker2 == null) break;
        }

        return list1;
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
