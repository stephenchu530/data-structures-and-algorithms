package Tree;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public BinaryTree() {
        this.setRoot(null);
    }

    public void getMax() {
        if (this.getRoot() == null)
            System.out.println("Empty tree. Nothing to find max on!");
        else
            // Calls the recursive helper method
            System.out.println(getMaxHelper(this.getRoot()));
    }

    public T getMaxHelper(TreeNode<T> node) {
        TreeNode<T> leftNode = node.getLeft();
        TreeNode<T> rightNode = node.getRight();

        T currentValue = node.getValue();

        if (leftNode == null && rightNode == null)
            return currentValue;

        T leftValue = null;
        T rightValue = null;

        if (leftNode != null)
            leftValue = this.getMaxHelper(node.getLeft());
        if (rightNode != null)
            rightValue = this.getMaxHelper(node.getRight());

        if (leftValue == null)
            return (currentValue.compareTo(rightValue) < 0) ? rightValue : currentValue;

        if (rightValue == null)
            return (currentValue.compareTo(leftValue) < 0) ? leftValue : currentValue;

        T bigger = (leftValue.compareTo(rightValue) < 0) ? rightValue : leftValue;

        return (currentValue.compareTo(bigger) < 0) ? bigger : currentValue;
    }

    public String breadthFirst() {
        StringBuilder output = new StringBuilder();
        TreeNode<T> tempTreeNode;
        ArrayList<TreeNode<T>> tempQueue = new ArrayList<>();

        if (this.getRoot() != null) {
            tempQueue.add(this.getRoot());
            while (!tempQueue.isEmpty()) {
                tempTreeNode = tempQueue.remove(0);
                output.append(tempTreeNode.getValue());
                output.append(" ");
                if (tempTreeNode.getLeft() != null)
                    tempQueue.add(tempTreeNode.getLeft());
                if (tempTreeNode.getRight() != null)
                    tempQueue.add(tempTreeNode.getRight());
            }
        }
        return output.toString().trim();
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

    /*
     * Setters and Getters Section
     */

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }
}
