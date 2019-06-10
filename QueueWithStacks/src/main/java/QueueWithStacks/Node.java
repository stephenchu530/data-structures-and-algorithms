package QueueWithStacks;

public class Node {
    private int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value) {
        this.setValue(value);
        this.setNext(null);
    }

    public Node(int value, Node next) {
        this(value);
        this.setNext(next);
    }
}
