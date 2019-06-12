package fifoAnimalShelter;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testInstantiate() {
        Animal testAnimal1 = new Animal("Cat");
        System.out.println(testAnimal1.getValue());
        System.out.println(testAnimal1.getDate());
        Animal testAnimal2 = new Animal("Dog");
        System.out.println(testAnimal2.getValue());
        System.out.println(testAnimal2.getDate());
        System.out.println(testAnimal2.getDate().compareTo(testAnimal1.getDate()));
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