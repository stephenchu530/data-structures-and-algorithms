package Tree;

import java.util.ArrayList;

public class KTreeNode<T> extends TreeNode<T> {
    private ArrayList<KTreeNode<T>> children;

    public KTreeNode(T value) {
        super(value);
        this.children = new ArrayList<>();
    }

    public ArrayList<KTreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(KTreeNode<T> child) {
        this.children.add(child);
    }
}
