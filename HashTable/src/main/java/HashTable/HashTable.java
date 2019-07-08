/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;


public class HashTable<T> {
    private Node<T> table[];
    private int used;
    private int size;
    private double load;

    public HashTable() {
        this.setUsed(0);
        this.setSize(4);
        this.setLoad(0.0);
        this.setTable(new Node[4]);
    }

    private int hash(String key) {
        return 0;
    }

    public Node<T>[] getTable() {
        return this.table;
    }

    public void setTable(Node<T>[] table) {
        this.table = table;
    }

    public int getUsed() {
        return this.used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getLoad() {
        return this.load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}

class Node<T> {
    private String key;
    private T value;
    private Node<T> next;

    public Node(String key, T value, Node<T> next) {
        this.setKey(key);
        this.setValue(value);
        this.setNext(null);
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
