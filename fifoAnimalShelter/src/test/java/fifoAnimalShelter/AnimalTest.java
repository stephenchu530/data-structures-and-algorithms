package fifoAnimalShelter;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testInstantiate() {
        Animal testAnimal = new Animal("Cat");
    }

    @Test
    public void testGetValue() {
        Animal testAnimal = new Animal("cat");
        assertEquals("Should return the appropriate value",
                "cat",
                testAnimal.getValue()
        );
    }

    @Test
    public void testGetDate() {
        Animal testAnimal = new Animal("cat");
        assertEquals("Should return a date type",
                Date.class,
                testAnimal.getDate().getClass()
        );
    }
}