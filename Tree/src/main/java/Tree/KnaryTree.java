package Tree;

public class KnaryTree<T> {

    private KTreeNode<T> root;

    public KnaryTree() {
        this.setRoot(null);
    }

    public KTreeNode<T> getRoot() {
        return this.root;
    }

    public void setRoot(KTreeNode<T> root) {
        this.root = root;
    }
}
