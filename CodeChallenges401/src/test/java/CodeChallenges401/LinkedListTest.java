package CodeChallenges401;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testLLInsert() {
        LinkedList testLL = new LinkedList();

        assertNotNull("Should not return null",
                testLL.insert(4));
    }

    @Test public void testLLPrintEmptyList() {
        LinkedList testLL = new LinkedList();

        assertEquals("Linked List should be empty",
                new ArrayList<>(),
                testLL.print()
        );
    }

    @Test public void testLLIncludesEmptyList() {
        LinkedList testLL = new LinkedList();

        assertFalse(".includes() method should come back false",
                testLL.includes(5)
        );
    }

    @Test public void testLLPrintSingleItem() {
        LinkedList testLL = new LinkedList();

        testLL.insert(42);
        assertEquals(".print() method should return a single item",
                new ArrayList<>(Arrays.asList(42)),
                testLL.print()
        );
    }

    @Test public void testLLIncludesSingleItemTrue() {
        LinkedList testLL = new LinkedList();

        testLL.insert(42);
        assertTrue(".includes() method should return true",
                testLL.includes(42)
        );
    }

    @Test public void testLLIncludesSingleItemFalse() {
        LinkedList testLL = new LinkedList();

        testLL.insert(42);
        assertFalse(".includes() method should return false",
                testLL.includes(52)
        );
    }

    @Test public void testLLPrintMultipleItems() {
        LinkedList testLL = new LinkedList();

        testLL.insert(103);
        testLL.insert(7);
        testLL.insert(45);
        testLL.insert(5);
        assertEquals(".print() method should return multiple items",
                new ArrayList<Integer> (Arrays.asList(5, 45, 7, 103)),
                testLL.print()
        );
    }

    @Test public void testLLIncludesMultipleItemsTrue() {
        LinkedList testLL = new LinkedList();

        testLL.insert(234);
        testLL.insert(73);
        testLL.insert(3085);
        testLL.insert(-348);
        assertTrue(".includes() method should come back false",
                testLL.includes(3085)
        );
    }

    @Test public void testLLIncludesMultipleItemsFalse() {
        LinkedList testLL = new LinkedList();

        testLL.insert(-436);
        testLL.insert(59);
        testLL.insert(-3);
        testLL.insert(0);
        assertFalse(".includes() method should come back false",
                testLL.includes(45)
        );
    }
}
