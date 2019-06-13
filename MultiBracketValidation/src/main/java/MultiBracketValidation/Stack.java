package MultiBracketValidation;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public T peek() {
        if (this.top == null)
            throw new IllegalStateException("Nothing to peek!");
        return this.top.getValue();
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(this.top);
        this.top = newNode;
    }

    public T pop() {
        if (this.top == null)
            throw new IllegalStateException("Nothing to pop!");
        T tmp = this.top.getValue();
        this.top = this.top.getNext();
        return tmp;
    }
}
