package stacksandqueues;

public class Queue {
    private Node front;
    private Node back;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public Queue() {
        this.setFront(null);
        this.setBack(null);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.getFront() == null)
            this.setFront(newNode);
        else
            this.getBack().setNext(newNode);
        this.setBack(newNode);
    }

    public int dequeue() {
        if (this.getFront() == null)
            throw new IllegalStateException("Cannot dequeue an empty queue!");
        Node node = this.getFront();
        int value = node.getValue();
        this.setFront(node.getNext());
        return value;
    }

    public int peek() {
        if (this.getFront() == null)
            throw new IllegalAccessError("Cannot peek an empty queue!");
        return this.getFront().getValue();
    }
}
