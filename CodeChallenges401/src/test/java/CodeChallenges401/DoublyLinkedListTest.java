package CodeChallenges401;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class DoublyLinkedListTest {
    @Test public void testDLLInsert() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        assertNotNull("Should not return null",
                testDLL.insert(4));
    }

    @Test public void testDLLForwardPrintEmptyList() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        assertEquals("Linked List should be empty",
                new ArrayList<>(),
                testDLL.forwardPrint()
        );
    }

    @Test public void testDLLBackwardPrintEmptyList() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        assertEquals("Linked List should be empty",
                new ArrayList<>(),
                testDLL.backwardPrint()
        );
    }

    @Test public void testDLLIncludesEmptyList() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        assertFalse(".includes() method should come back false",
                testDLL.includes(5)
        );
    }

    @Test public void testDLLForwardPrintSingleItem() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(42);
        assertEquals(".print() method should return a single item",
                new ArrayList<>(Arrays.asList(42)),
                testDLL.forwardPrint()
        );
    }

    @Test public void testDLLBackwardPrintSingleItem() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(42);
        assertEquals(".print() method should return a single item",
                new ArrayList<>(Arrays.asList(42)),
                testDLL.backwardPrint()
        );
    }

    @Test public void testDLLIncludesSingleItemTrue() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(42);
        assertTrue(".includes() method should return true",
                testDLL.includes(42)
        );
    }

    @Test public void testDLLIncludesSingleItemFalse() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(42);
        assertFalse(".includes() method should return false",
                testDLL.includes(52)
        );
    }

    @Test public void testDLLForwardPrintMultipleItems() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(103);
        testDLL.insert(7);
        testDLL.insert(45);
        testDLL.insert(5);
        assertEquals(".print() method should return multiple items",
                new ArrayList<Integer> (Arrays.asList(5, 45, 7, 103)),
                testDLL.forwardPrint()
        );
    }

    @Test public void testDLLIncludesMultipleItemsTrue() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(234);
        testDLL.insert(73);
        testDLL.insert(3085);
        testDLL.insert(-348);
        assertTrue(".includes() method should come back false",
                testDLL.includes(3085)
        );
    }

    @Test public void testDLLIncludesMultipleItemsFalse() {
        DoublyLinkedList testDLL = new DoublyLinkedList();

        testDLL.insert(-436);
        testDLL.insert(59);
        testDLL.insert(-3);
        testDLL.insert(0);
        assertFalse(".includes() method should come back false",
                testDLL.includes(45)
        );
    }
}
