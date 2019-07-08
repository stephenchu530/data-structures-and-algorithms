package HashTable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    public LinkedList<Integer> testLL;

    @Before
    public void setUpLinkedList() {
        this.testLL = new LinkedList();
    }

    @After
    public void tearDownLinkedList() {
        this.testLL = null;
    }

    @Test
    public void testLLInstantiate() {
        LinkedList<Integer> testLinkedList = new LinkedList<Integer>();
    }

    @Test
    public void testGetNodeEmptyLL() {
        assertNull("Should return null",
                this.testLL.getNode("test")
        );
    }

    @Test
    public void testAddNode() {
        this.testLL.addNode("test", 0);
    }

    @Test
    public void testGetNode() {
        this.testLL.addNode("test1", 1);
        assertNotNull("Should not be null",
                this.testLL.getNode("test1")
        );
        assertTrue("Should be equal",
                this.testLL.getNode("test1").getKey().equals("test1")
        );
        assertTrue("Should be equal",
                this.testLL.getNode("test1").getValue().equals(1)
        );
    }

    @Test
    public void testGetNodeNotInLL() {
        this.testLL.addNode("test1", 1);
        assertNull("Should be null",
                this.testLL.getNode("test2")
        );
    }
}
