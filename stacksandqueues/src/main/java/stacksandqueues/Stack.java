package stacksandqueues;

public class Stack {
    private Node top;

    public Node getTop() {
        return this.top;
    }

    public void setTop(Node node) {
        this.top = node;
    }

    public Stack() {
        this.setTop(null);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (this.getTop() == null) {
            this.setTop(newNode);
        } else {
            newNode.setNext(this.getTop());
            this.setTop(newNode);
        }
    }

    public int pop() {
        if (this.getTop() == null)
            throw new IllegalStateException("Cannot pop an empty stack!");

        Node node = this.getTop();
        int value = node.getValue();
        this.setTop(node.getNext());
        return value;
    }

    public int peek() {
        if (this.getTop() == null)
            throw new IllegalAccessError("Cannot peek an empty stack!");
        return this.getTop().getValue();
    }
}
