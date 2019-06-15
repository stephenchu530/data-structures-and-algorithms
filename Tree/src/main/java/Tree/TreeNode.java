package Tree;

public class TreeNode<T> {
    private T value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(T value) {
        this.value = value;
        this.setLeft(null);
        this.setRight(null);
    }

    public T getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
