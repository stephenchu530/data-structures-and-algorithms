package CodeChallenges401;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testLLInstantiate() {
        LinkedList testLL = new LinkedList();
    }

    @Test public void testLLIncludesEmptyList() {
        LinkedList testLL = new LinkedList();

        assertFalse("Should return false because linked list is empty",
                testLL.includes(42)
        );
    }

    @Test public void testLLToStringEmptyList() {
        LinkedList testLL = new LinkedList();

        assertEquals("Linked List should be empty",
                new String("[]"),
                testLL.toString()
        );
    }

    @Test public void testLLPrintEmptyList() {
        LinkedList testLL = new LinkedList();
        ByteArrayOutputStream displayOutput = new ByteArrayOutputStream();

        System.setOut(new PrintStream(displayOutput));
        testLL.print();
        assertEquals("Should display to screen an empty list []",
                "[]\n",
                displayOutput.toString());
    }

    @Test public void testLLInsertSingleValue() {
        LinkedList testLL = new LinkedList();

        testLL.insert(42);
    }

    @Test public void testLLIncludesSingleValueTrue() {
        LinkedList testLL = new LinkedList();

        testLL.insert(42);
        assertTrue("Should return true",
                testLL.includes(42)
        );
    }

    @Test public void testLLIncludesSingleValueFalse() {
        LinkedList testLL = new LinkedList();

        testLL.insert(56);
        assertFalse("Should return false",
                testLL.includes(26)
        );
    }

    @Test public void testLLToStringSingleItem() {
        LinkedList testLL = new LinkedList();

        testLL.insert(212);
        assertEquals("Should return [212]",
                new String("[212]"),
                testLL.toString()
        );
    }

    @Test public void testLLPrintSingleItem() {
        LinkedList testLL = new LinkedList();
        ByteArrayOutputStream displayOutput = new ByteArrayOutputStream();

        testLL.insert(34);
        System.setOut(new PrintStream(displayOutput));
        testLL.print();
        assertEquals("Should display to screen [34]",
                "[34]\n",
                displayOutput.toString());
    }




    @Test public void testLLInsertMultipleValues() {
        LinkedList testLL = new LinkedList();

        testLL.insert(-33);
        testLL.insert(0);
        testLL.insert(17);
        testLL.insert(1001);
        testLL.insert(455);
    }

    @Test public void testLLIncludesMultipleValuesTrue1() {
        LinkedList testLL = new LinkedList();

        testLL.insert(-33);
        testLL.insert(0);
        testLL.insert(17);
        testLL.insert(1001);
        testLL.insert(455);
        assertTrue("Should return true",
                testLL.includes(-33)
        );
    }

    @Test public void testLLIncludesMultipleValuesTrue2() {
        LinkedList testLL = new LinkedList();

        testLL.insert(-33);
        testLL.insert(0);
        testLL.insert(17);
        testLL.insert(1001);
        testLL.insert(455);
        assertTrue("Should return true",
                testLL.includes(455)
        );
    }

    @Test public void testLLIncludesMultipleValuesFalse() {
        LinkedList testLL = new LinkedList();

        testLL.insert(-33);
        testLL.insert(0);
        testLL.insert(17);
        testLL.insert(1001);
        testLL.insert(455);
        assertFalse("Should return false",
                testLL.includes(4)
        );
    }

    @Test public void testLLToStringMultipleItems() {
        LinkedList testLL = new LinkedList();

        testLL.insert(-33);
        testLL.insert(0);
        testLL.insert(17);
        testLL.insert(1001);
        testLL.insert(455);
        assertEquals("Should return [455, 1001, 17, 0, -33]",
                new String("[455, 1001, 17, 0, -33]"),
                testLL.toString()
        );
    }

    @Test public void testLLPrintMultipleItems() {
        LinkedList testLL = new LinkedList();
        ByteArrayOutputStream displayOutput = new ByteArrayOutputStream();

        testLL.insert(-33);
        testLL.insert(0);
        testLL.insert(17);
        testLL.insert(1001);
        testLL.insert(455);

        System.setOut(new PrintStream(displayOutput));
        testLL.print();
        assertEquals("Should display to screen [455, 1001, 17, 0, -33]",
                "[455, 1001, 17, 0, -33]\n",
                displayOutput.toString()
        );
    }
}
