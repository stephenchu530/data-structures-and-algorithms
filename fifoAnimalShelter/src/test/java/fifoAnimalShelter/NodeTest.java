package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    public Node<String> testNode;

    @Before
    public void setUpNode() {
        this.testNode = new Node<>("fun");
    }

    @Test
    public void testInstantiate() {
        Node<Integer> testNode1 = new Node<Integer>(111);
        Node<String> testNode2 = new Node<>("fun");
        Node<Object> testNode3 = new Node<>("fun");
    }

    @Test
    public void getValue() {
        assertEquals("Should return expected value",
                "fun",
                this.testNode.getValue()
        );
    }

    @Test
    public void getNext() {
        assertNull("Should return null",
                this.testNode.getNext()
        );
    }

    @Test
    public void setNext() {
        Node<String> testNode2 = new Node<>("555");
        this.testNode.setNext(testNode2);
        assertEquals("Should return the appropriate object",
                testNode2,
                this.testNode.getNext()
        );
        assertNull("Should return null",
                testNode2.getNext()
        );
    }
}