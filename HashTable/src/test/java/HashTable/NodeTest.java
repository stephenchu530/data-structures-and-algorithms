package HashTable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    public Node<Integer> testNode;

    @Before
    public void setUpNode() {
        this.testNode = new Node<Integer>("test", 0);
    }

    @After
    public void tearDownNode() {
        this.testNode = null;
    }

    @Test
    public void testNodeInstantiate() {
        Node<Integer> testNode = new Node<>("test", 1);
    }

    @Test
    public void testGetSetKey() {
        assertTrue("Should be equal",
                this.testNode.getKey().equals("test")
        );
        this.testNode.setKey("aaa");
        assertTrue("Should be equal",
                this.testNode.getKey().equals("aaa")
        );
    }

    @Test
    public void testGetSetValue() {
        assertTrue("Should be equal",
                this.testNode.getValue().equals(0)
        );
        this.testNode.setValue(55);
        assertTrue("Should be equal",
                this.testNode.getValue().equals(55)
        );
    }

    @Test
    public void testGetSetNext() {
        assertNull("Should be null",
                this.testNode.getNext()
        );
        Node<Integer> newNode = new Node<>("test2", 2);
        this.testNode.setNext(newNode);
        assertTrue("Should be equal",
                this.testNode.getNext().equals(newNode)
        );
    }
}
