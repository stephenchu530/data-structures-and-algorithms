package MultiBracketValidation;

public class Stack<T> {
    private Node<T> top;

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> node) {
        this.top = node;
    }

    public Stack() {
        this.top = null;
    }

    public T peek() {
        if (this.getTop() == null)
            throw new IllegalStateException("Nothing to peek!");
        return this.getTop().getValue();
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(this.getTop());
        this.setTop(newNode);
    }

    public T pop() {
        if (this.getTop() == null)
            throw new IllegalStateException("Nothing to pop!");
        T tmp = this.getTop().getValue();
        this.setTop(this.getTop().getNext());
        return tmp;
    }
}
