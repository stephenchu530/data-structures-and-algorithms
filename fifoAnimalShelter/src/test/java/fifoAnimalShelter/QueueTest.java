package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    public Queue<String> testQueue;

    @Before
    public void setUpQueue() {
        this.testQueue = new Queue<>();
    }

    @Test
    public void testInstantiate() {
        Queue<Integer> testQueue1 = new Queue<>();
        Queue<String> testQueue2 = new Queue<>();
        Queue<Object> testQueue3 = new Queue<>();
    }

    @Test
    public void testEnqueue() {
        this.testQueue.enqueue("Hello, World!");
    }

    @Test
    public void testDequeue() {
        this.testQueue.enqueue("Hello, World!");
        assertEquals("Should the proper string",
                "Hello, World!",
                this.testQueue.dequeue()
        );
    }

    @Test(expected = IllegalStateException.class)
    public void testDequeueFail() {
        this.testQueue.dequeue();
    }

    @Test
    public void testMixedEnqueueDequeue() {
        this.testQueue.enqueue("AAA");
        assertEquals("Should the proper string",
                "AAA",
                this.testQueue.dequeue()
        );
        this.testQueue.enqueue("BBB");
        this.testQueue.enqueue("CCC");
        assertEquals("Should the proper string",
                "BBB",
                this.testQueue.dequeue()
        );
        this.testQueue.enqueue("DDD");
        assertEquals("Should the proper string",
                "CCC",
                this.testQueue.dequeue()
        );
        assertEquals("Should the proper string",
                "DDD",
                this.testQueue.dequeue()
        );
    }
}