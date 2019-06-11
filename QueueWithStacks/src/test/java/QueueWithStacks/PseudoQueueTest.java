package QueueWithStacks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    private PseudoQueue testPQ;

    @Before
    public void setUpPseudoQueue() {
        this.testPQ = new PseudoQueue();
    }

    @After
    public void tearDownPseudoQueue() {
        this.testPQ = null;
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

    @Test(expected = IllegalAccessError.class)
    public void testDequeueFail() {
        this.testPQ.dequeue();
    }

    @Test
    public void testMultiEnqueue() {
        this.testPQ.enqueue(3);
        this.testPQ.enqueue(4);
        this.testPQ.enqueue(5);
    }

    @Test
    public void testMultiDequeue() {
        this.testPQ = new PseudoQueue();
        this.testPQ.enqueue(5);
        this.testPQ.enqueue(6);
        this.testPQ.enqueue(7);

        assertEquals("Should return the correct value",
                5,
                this.testPQ.dequeue()
        );
        assertEquals("Should return the correct value",
                6,
                this.testPQ.dequeue()
        );
        this.testPQ.enqueue(8);
        assertEquals("Should return the correct value",
                7,
                this.testPQ.dequeue()
        );
        assertEquals("Should return the correct value",
                8,
                this.testPQ.dequeue()
        );
    }

    @Test
    public void testMultiEnqueueAndDequeue() {
        this.testPQ.enqueue(55);
        assertEquals("Should return the correct value",
                55,
                this.testPQ.dequeue()
        );
        this.testPQ.enqueue(66);
        assertEquals("Should return the correct value",
                66,
                this.testPQ.dequeue()
        );
        this.testPQ.enqueue(77);
        this.testPQ.enqueue(88);
        assertEquals("Should return the correct value",
                77,
                this.testPQ.dequeue()
        );
        assertEquals("Should return the correct value",
                88,
                this.testPQ.dequeue()
        );
    }
}