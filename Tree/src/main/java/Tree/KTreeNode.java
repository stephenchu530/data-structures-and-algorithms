package Tree;

import java.util.ArrayList;

public class KTreeNode<T> {
    private T value;
    private ArrayList<KTreeNode<T>> children;

    public KTreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    /*
     * Getters and Setters Section
     */

    public T getValue() {
        return this.value;
    }

    // Returns a copy of a collection type for a getter to prevent security issues
    public ArrayList<KTreeNode<T>> getChildren() {
        return new ArrayList<KTreeNode<T>>(this.children);
    }

    // Sets a new copy of the array list to the children
    public void setChildren(KTreeNode<T> child) {
        this.children.add(child);
        this.children = new ArrayList<KTreeNode<T>>(this.children);
    }
}
