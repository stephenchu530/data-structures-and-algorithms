package CodeChallenges401;

import java.util.ArrayList;

public class LinkedList {
    private Node head;

    // Instantiate new empty linked list
    public void LinkdedList() {
        head = null;
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
        private int value = 0;
        private Node next = null;

        // Constructor
        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}