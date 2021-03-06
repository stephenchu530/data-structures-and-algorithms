package Tree;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {
    public BinaryTree<Integer> bTree;

    @Before
    public void setUpBinaryTree() {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> l = new TreeNode<>(2);
        TreeNode<Integer> r = new TreeNode<>(3);
        TreeNode<Integer> ll = new TreeNode<>(4);
        TreeNode<Integer> lr = new TreeNode<>(5);
        TreeNode<Integer> rl = new TreeNode<>(6);
        TreeNode<Integer> rr = new TreeNode<>(7);
        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        r.setRight(rr);
        this.bTree = new BinaryTree<>();
        this.bTree.setRoot(root);
    }

    @Test
    public void testPreOrder() {
        assertEquals("Should return the proper output",
                new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 7)),
                this.bTree.preOrder()
        );
    }

    @Test
    public void testInOrder() {
        assertEquals("Should return the proper output",
                new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3, 7)),
                this.bTree.inOrder()
        );
    }

    @Test
    public void testPostOrder() {
        assertEquals("Should return the proper output",
                new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1)),
                this.bTree.postOrder()
        );
    }

    @Test
    public void testBreadthFirst() {
        assertTrue("Should return the tree in breadth first order",
                this.bTree.breadthFirst().equals("1 2 3 4 5 6 7")
        );
    }

    @Test
    public void testGetMaxValueSingleNode() {
        assertTrue("Should return the value of the only node",
                bTree.getMaxHelper(new TreeNode<>(4)).equals(4));
    }

    @Test
    public void testGetMaxValueLeftNode() {
        TreeNode<Integer> root = new TreeNode<Integer>(5);
        TreeNode<Integer> left = new TreeNode<Integer>(8);
        root.setLeft(left);

        assertTrue("Should return the max value",
                bTree.getMaxHelper(root).equals(8));
    }

    @Test
    public void testGetMaxValueRightNode() {
        TreeNode<Integer> root = new TreeNode<Integer>(8);
        TreeNode<Integer> right = new TreeNode<Integer>(3);
        root.setRight(right);

        assertTrue("Should return the max value",
                bTree.getMaxHelper(root).equals(8));
    }

    @Test
    public void testGetMaxValueLeftRightNode() {
        TreeNode<Integer> root = new TreeNode<Integer>(8);
        TreeNode<Integer> left = new TreeNode<Integer>(9);
        TreeNode<Integer> right = new TreeNode<Integer>(10);
        root.setLeft(left);
        root.setRight(right);

        assertTrue("Should return the max value",
                bTree.getMaxHelper(root).equals(10));
    }

    @Test
    public void testGetMaxValueBig() {
        assertTrue("Should return the max value",
                bTree.getMaxHelper(this.bTree.getRoot()).equals(7));
    }
}