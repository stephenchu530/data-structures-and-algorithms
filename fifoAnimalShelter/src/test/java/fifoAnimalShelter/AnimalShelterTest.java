package fifoAnimalShelter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    public AnimalShelter shelter;

    @Before
    public void setUpShelter() {
        this.shelter = new AnimalShelter();
    }

    @After
    public void tearDownShelter() {
        this.shelter = null;
    }

    @Test
    public void testInstantiate() {
        AnimalShelter testShelter = new AnimalShelter();
    }

    @Test
    public void testEnqueueOneCatDog() {
        this.shelter.enqueue("dog");
        this.shelter.enqueue("cat");
    }

    @Test
    public void testDequeueEmptyShelter() {
        assertEquals("Should return an appropriate response",
                "There are no doggos :(",
                this.shelter.dequeue("dog")
        );
        assertEquals("Should return an appropriate response",
                "There are no kittehs :(",
                this.shelter.dequeue("cat")
        );
    }

    @Test
    public void testDequeueSimple() {
        this.shelter.enqueue("dog");
        this.shelter.enqueue("cat");
        assertEquals("Should return an appropriate response",
                "dog",
                this.shelter.dequeue("dog")
        );
        assertEquals("Should return an appropriate response",
                "cat",
                this.shelter.dequeue("cat")
        );
    }

    @Test
    public void testDequeueNoPref() {
        System.out.println("Wait 6 seconds...");
        this.shelter.enqueue("cat");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.shelter.enqueue("dog");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.shelter.enqueue("cat");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.shelter.enqueue("dog");
        this.shelter.enqueue("dog");
        assertEquals("Should return an appropriate response",
                "cat",
                this.shelter.dequeue(null)
        );
        assertEquals("Should return an appropriate response",
                "dog",
                this.shelter.dequeue(null)
        );
        assertEquals("Should return an appropriate response",
                "cat",
                this.shelter.dequeue(null)
        );
    }
}