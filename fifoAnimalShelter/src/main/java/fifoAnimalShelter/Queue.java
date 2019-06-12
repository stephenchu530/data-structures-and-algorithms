package fifoAnimalShelter;

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

    }
}
