package fifoAnimalShelter;

// Generic queue class
public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getBack() {
        return back;
    }

    public void setBack(Node<T> back) {
        this.back = back;
    }

    public Queue() {
        this.setFront(null);
        this.setBack(null);
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.front == null)
            this.setFront(newNode);
        else
            this.back.setNext(newNode);
        this.setBack(newNode);
    }

    public T dequeue() {
        if (this.getFront() == null)
            throw new IllegalStateException("Cannot dequeue an empty queue!");
        T tempValue = this.getFront().getValue();
        this.setFront(this.getFront().getNext());
        return tempValue;
    }
}
