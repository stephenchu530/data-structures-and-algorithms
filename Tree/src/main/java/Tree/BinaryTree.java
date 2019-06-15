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
        preOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        inOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    public ArrayList<T> postOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        postOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    private void preOrderHelper(TreeNode<T> tree, ArrayList<T> outputArray) {
        if (tree == null) return;
        outputArray.add(tree.getValue());
        this.preOrderHelper(tree.getLeft(), outputArray);
        this.preOrderHelper(tree.getRight(), outputArray);
    }

    private void inOrderHelper(TreeNode<T> tree, ArrayList<T> outputArray) {
        if (tree == null) return;
        this.inOrderHelper(tree.getLeft(), outputArray);
        outputArray.add(tree.getValue());
        this.inOrderHelper(tree.getRight(), outputArray);
    }

    private void postOrderHelper(TreeNode<T> tree, ArrayList<T> outputArray) {
        if (tree == null) return;
        this.postOrderHelper(tree.getLeft(), outputArray);
        this.postOrderHelper(tree.getRight(), outputArray);
        outputArray.add(tree.getValue());
    }
}
