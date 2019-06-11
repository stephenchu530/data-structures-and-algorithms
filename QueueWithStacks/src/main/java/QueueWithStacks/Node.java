package QueueWithStacks;

public class Node {
    private int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
        this.setNext(null);
    }
}
