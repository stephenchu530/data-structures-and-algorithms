package fifoAnimalShelter;

// Generic node type
public class Node<T> {
    private T value;
    private Node<T> next;

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T value) {
        this.value = value;
        this.setNext(null);
    }
}
