package TreeIntersection;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeNodeTest {
    public TreeNode<Integer> treeNode;

    @Before
    public void setUpTreeNode() {
        this.treeNode = new TreeNode<>(1);
    }

    @After
    public void tearDownTreeNode() {
        this.treeNode = null;
    }

    @Test
    public void testInstantiate() {
        TreeNode<Integer> testNodeInt = new TreeNode<>(1);
        TreeNode<Character> testNodeChar = new TreeNode<>('A');
        TreeNode<String> testNodeString = new TreeNode<>("I am a string");
        TreeNode<ArrayList> testNodeArray = new TreeNode<ArrayList>(new ArrayList<>());
    }

    @Test
    public void testGetValue() {
        assertEquals("Should return the appropriate value",
                (Integer) 1,
                this.treeNode.getValue()
        );
    }

    @Test
    public void testSetGetLeft() {
        assertNull("Should be null",
                this.treeNode.getLeft()
        );
        TreeNode<Integer> testLeft = new TreeNode<>(2);
        this.treeNode.setLeft(testLeft);
        assertEquals("Should return a tree node",
                testLeft,
                this.treeNode.getLeft()
        );
    }

    @Test
    public void testSetGetRight() {
        assertNull("Should be null",
                this.treeNode.getRight()
        );
        TreeNode<Integer> testRight = new TreeNode<>(33);
        this.treeNode.setRight(testRight);
        assertEquals("Should return a tree node",
                testRight,
                this.treeNode.getRight()
        );
    }
}
