package QueueWithStacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    private PseudoQueue testPQ;

    @Before
    public void setUpPseudoQueue() {
        this.testPQ = new PseudoQueue();
    }
    @Test
    public void testInstantiate() {
        PseudoQueue testPQ;
    }

    @Test
    public void testEnqueue() {
        this.testPQ.enqueue(1);
    }

    @Test
    public void testDequeue() {
        this.testPQ.enqueue(2);
        assertEquals("Should return the correct value",
                2,
                this.testPQ.dequeue()
        );
    }

    @Test
    public void testMultiEnqueue() {
        this.testPQ.enqueue(3);
        this.testPQ.enqueue(4);
        this.testPQ.enqueue(5);
    }

    @Test
    public void testMultiDequeue() {
        PseudoQueue testPQ = new PseudoQueue();
        testPQ.enqueue(5);
        testPQ.enqueue(6);
        testPQ.enqueue(7);

        assertEquals("Should return the correct value",
                5,
                testPQ.dequeue()
        );
        assertEquals("Should return the correct value",
                6,
                testPQ.dequeue()
        );
        testPQ.enqueue(8);
        assertEquals("Should return the correct value",
                7,
                testPQ.dequeue()
        );
        assertEquals("Should return the correct value",
                8,
                testPQ.dequeue()
        );
    }
}