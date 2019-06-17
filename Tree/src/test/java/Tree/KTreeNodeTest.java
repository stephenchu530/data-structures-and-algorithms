package Tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class KTreeNodeTest {

    public KTreeNode<String> kTreeNode;

    @Before
    public void setUpKTreeNode() {
        this.kTreeNode = new KTreeNode<>("Hello, World!");
    }

    @Test
    public void testInstantiate() {
        KTreeNode<Integer> testInt = new KTreeNode<>(1);
        KTreeNode<Character> tesChar = new KTreeNode<>('A');
        KTreeNode<String> testString = new KTreeNode<>("A String");
    }

    @Test
    public void testGetValue() {
        assertTrue("Should be the proper return value",
                this.kTreeNode.getValue().equals("Hello, World!")
        );
    }

    @Test
    public void testGetChildrenNone() {
        assertEquals("Should return an empty array list",
                new ArrayList<String>(),
                this.kTreeNode.getChildren()
        );
    }

    @Test
    public void testSetOneChildren() {
        KTreeNode<String> childOne = new KTreeNode<>("Wut");
        this.kTreeNode.setChildren(childOne);
    }

    @Test
    public void testSetTwoChildren() {
        KTreeNode<String> childOne = new KTreeNode<>("Wut");
        KTreeNode<String> childTwo = new KTreeNode<>("Huh");
        this.kTreeNode.setChildren(childOne);
        this.kTreeNode.setChildren(childTwo);
    }

    @Test
    public void testGetMultipleChildren() {
        KTreeNode<String> childOne = new KTreeNode<>("Black Desert Online");
        KTreeNode<String> childTwo = new KTreeNode<>("Civilization V");
        this.kTreeNode.setChildren(childOne);
        this.kTreeNode.setChildren(childTwo);

        assertEquals("Should return the proper array of stuff",
                new ArrayList<>(Arrays.asList(childOne, childTwo)),
                this.kTreeNode.getChildren()
        );
    }
}