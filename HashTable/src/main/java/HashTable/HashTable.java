/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

public class HashTable<T> {
    private LinkedList<T> table[];
    private int used;
    private int size;
    private double load;
    private final int STARTSIZE = 1024;
    private final long PRIMEONE = 51383;
    private final long PRIMETWO = 71353;

    public HashTable() {
        this.setUsed(0);
        this.setSize(STARTSIZE);
        this.setLoad(0.0);
        this.setTable(new LinkedList[STARTSIZE]);
    }

    public void add(String key, T value) {
        Node<T> helperNode = getNodeHelper(key);
        if (helperNode == null) {
            if (this.getTable()[this.hash(key)] == null) {
                LinkedList<T> ll = new LinkedList<T>();
                ll.addNode(key, value);
                this.getTable()[this.hash(key)] = ll;
            } else {
                this.getTable()[this.hash(key)].addNode(key, value);
            }
        }
        else {
            this.getTable()[this.hash(key)].getNode(key).setValue(value);
        }

        this.setUsed(this.getUsed() + 1);
        this.setLoad((double) this.getUsed() / this.getSize());
    }

    public T get(String key) {
        Node<T> node = getNodeHelper(key);
        if (node == null)
            return null;
        return node.getValue();
    }

    public boolean contains(String key) {
        if (getNodeHelper(key) == null)
            return false;
        return true;
    }

    private int hash(String key) {
        long number = 1L;

        for (int i = 0; i < key.length(); i++)
            number += ((long) key.charAt(i) + PRIMEONE + i) * PRIMETWO;

        return (int) (number % (long) this.size);
    }

    private Node<T> getNodeHelper(String key) {
        LinkedList<T> linkedList = this.getTable()[this.hash(key)];
        if (linkedList == null)
            return null;
        if (linkedList.getSize() == 0)
            return null;
        return linkedList.getNode(key);
    }

    private LinkedList<T>[] getTable() {
        return this.table;
    }

    private void setTable(LinkedList<T>[] table) {
        this.table = table;
    }

    private int getUsed() {
        return this.used;
    }

    private void setUsed(int used) {
        this.used = used;
    }

    private int getSize() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public double getLoad() {
        return this.load;
    }

    private void setLoad(double load) {
        this.load = load;
    }
}

class LinkedList<T> {
    private int size;
    private Node<T> head;

    public LinkedList() {
        this.setSize(0);
        this.setHead(null);
    }

    public Node<T> addNode(String key, T value) {
        Node<T> newNode = new Node<T>(key, value);
        newNode.setNext(this.getHead());
        this.setHead(newNode);
        this.setSize(this.getSize() + 1);
        return newNode;
    }

    public Node<T> getNode(String key) {
        Node<T> walker = this.getHead();
        while (walker != null) {
            if (walker.getKey() == key) {
                return walker;
            }
            walker = walker.getNext();
        }
        return null;
    }

    public int getSize() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private Node<T> getHead() {
        return this.head;
    }

    private void setHead(Node<T> head) {
        this.head = head;
    }
}

class Node<T> {
    private String key;
    private T value;
    private Node<T> next;

    public Node(String key, T value) {
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
