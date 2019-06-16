package Tree;

public class TreeNode<T> {
    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        // No setter for value because set only once
        this.value = value;
        this.setLeft(null);
        this.setRight(null);
    }

    /*
     * Getters and Setters Section
     */

    public T getValue() {
        return value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}
