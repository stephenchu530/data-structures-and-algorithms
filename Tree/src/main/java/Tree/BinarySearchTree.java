package Tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    public void add(T value) {
        // Do not add the new value if it already exists in the BST
        // Don't throw an error (my choice)
        if (this.contains(value))
            return;

        TreeNode<T> newTreeNode = new TreeNode<>(value);
        TreeNode<T> root = this.getRoot();

        if (root == null)
            // Add the new tree node if the BST is empty to begin with
            this.setRoot(newTreeNode);
        else
            // Execute the recursive addHelper method if the BST is not empty
            this.addHelper(root, newTreeNode);
    }

    private void addHelper(TreeNode<T> treeNode, TreeNode<T> newTreeNode) {
        // Magic happens here with the compareTo method.
        // It is needed for comparing generics which is why the T type for the class signature extends Comparable<T>
        if (newTreeNode.getValue().compareTo(treeNode.getValue()) < 0) {
            if (treeNode.getLeft() == null)
                treeNode.setLeft(newTreeNode);
            else
                this.addHelper(treeNode.getLeft(), newTreeNode);
        } else {
            if (treeNode.getRight() == null)
                treeNode.setRight(newTreeNode);
            else
                this.addHelper(treeNode.getRight(), newTreeNode);
        }
    }

    public boolean contains(T value) {
        return this.containsHelper(this.getRoot(), value);
    }

    private boolean containsHelper(TreeNode<T> treeNode, T value) {
        if (treeNode == null)
            return false;

        if (treeNode.getValue().equals(value))
            return true;

        return this.containsHelper(treeNode.getLeft(), value) || this.containsHelper(treeNode.getRight(), value);
    }
}
