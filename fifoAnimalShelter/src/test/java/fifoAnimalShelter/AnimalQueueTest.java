package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalQueueTest {
    public AnimalQueue testAnimalQueue;

    @Before
    public void setUpQueue() {
        this.testAnimalQueue = new AnimalQueue();
    }

    @Test
    public void testInstantiate() {
        AnimalQueue testAnimalQueue1 = new AnimalQueue();
    }

    @Test
    public void testEnqueue() {
        this.testAnimalQueue.enqueue("Hello, World!");
    }

    @Test
    public void testDequeue() {
        this.testAnimalQueue.enqueue("Hello, World!");
        assertEquals("Should the proper string",
                "Hello, World!",
                this.testAnimalQueue.dequeue()
        );
    }

    @Test(expected = IllegalStateException.class)
    public void testDequeueFail() {
        this.testAnimalQueue.dequeue();
    }

    @Test
    public void testMixedEnqueueDequeue() {
        this.testAnimalQueue.enqueue("AAA");
        assertEquals("Should the proper string",
                "AAA",
                this.testAnimalQueue.dequeue()
        );
        this.testAnimalQueue.enqueue("BBB");
        this.testAnimalQueue.enqueue("CCC");
        assertEquals("Should the proper string",
                "BBB",
                this.testAnimalQueue.dequeue()
        );
        this.testAnimalQueue.enqueue("DDD");
        assertEquals("Should the proper string",
                "CCC",
                this.testAnimalQueue.dequeue()
        );
        assertEquals("Should the proper string",
                "DDD",
                this.testAnimalQueue.dequeue()
        );
    }
}