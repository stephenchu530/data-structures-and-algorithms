package Tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    private TreeNode<T> root;

    public TreeNode<T> getRoot() {
        return root;
    }

    public BinaryTree() {
        this.setRoot(null);
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public ArrayList<T> preOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        if (this.getRoot() != null)
            preOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        if (this.getRoot() != null)
            inOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    public ArrayList<T> postOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        if (this.getRoot() != null)
            postOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    private void preOrderHelper(TreeNode<T> tree, ArrayList<T> outputArray) {
        outputArray.add(tree.getValue());
        if (tree.getLeft() != null)
            this.preOrderHelper(tree.getLeft(), outputArray);
        if (tree.getRight() != null)
            this.preOrderHelper(tree.getRight(), outputArray);
    }

    private void inOrderHelper(TreeNode<T> tree, ArrayList<T> outputArray) {
        if (tree.getLeft() != null)
            this.inOrderHelper(tree.getLeft(), outputArray);
        outputArray.add(tree.getValue());
        if (tree.getRight() != null)
            this.inOrderHelper(tree.getRight(), outputArray);
    }

    private void postOrderHelper(TreeNode<T> tree, ArrayList<T> outputArray) {
        if (tree.getLeft() != null)
            this.postOrderHelper(tree.getLeft(), outputArray);
        if (tree.getRight() != null)
            this.postOrderHelper(tree.getRight(), outputArray);
        outputArray.add(tree.getValue());
    }
}
