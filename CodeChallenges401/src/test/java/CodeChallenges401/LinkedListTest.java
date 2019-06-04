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

    @Test public void testLLAppendSingleItem() {
        LinkedList testLL = new LinkedList();

        testLL.append(64);
    }

    @Test public void testLLAppendMultipleItems() {
        LinkedList testLL = new LinkedList();

        testLL.append(75);
        testLL.append(3);
        testLL.append(-395);
        testLL.append(67);
    }

    @Test public void testLLToStringAppendMultipleItems() {
        LinkedList testLL = new LinkedList();

        testLL.append(45);
        testLL.append(-9834);
        testLL.append(356);
        testLL.append(45);
        assertEquals("Should be [45, -9834, 356, 45]",
                "[45, -9834, 356, 45]",
                testLL.toString()
        );
    }

    @Test public void testLLToStringMixAppendInsertMultipleItems() {
        LinkedList testLL = new LinkedList();

        testLL.append(-45);
        testLL.insert(34);
        testLL.append(734);
        testLL.append(23);
        testLL.insert(5);
        assertEquals("Should be [5, 34, -45, 734, 23]",
                "[5, 34, -45, 734, 23]",
                testLL.toString()
        );
    }

    @Test public void testLLInsertBeforeSingleItemLL() {
        LinkedList testLL = new LinkedList();

        testLL.insert(86);
        testLL.insertBefore(86, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLLInsertBeforeEmptyLLError() {
        LinkedList testLL = new LinkedList();

        testLL.insertBefore(86, 5);
    }

    @Test public void testLLInsertBeforeMultipleItemLL() {
        LinkedList testLL = new LinkedList();

        testLL.insert(23);
        testLL.insert(56);
        testLL.insert(44);

        testLL.insertBefore(23, 22);
        testLL.insertBefore(56, 55);
        testLL.insertBefore(44, 43);

        assertEquals("Should be [43, 44, 55, 56, 22, 23]",
                "[43, 44, 55, 56, 22, 23]",
                testLL.toString()
        );
    }

    @Test public void testLLInsertAfterSingleItemLL() {
        LinkedList testLL = new LinkedList();

        testLL.append(56);
        testLL.insertAfter(56, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLLInsertAfterEmptyLLError() {
        LinkedList testLL = new LinkedList();

        testLL.insertAfter(56, 89);
    }

    @Test public void testLLInsertAfterMultipleItemLL() {
        LinkedList testLL = new LinkedList();

        testLL.insert(23);
        testLL.insert(56);
        testLL.insert(44);

        testLL.insertAfter(23, 24);
        testLL.insertAfter(56, 57);
        testLL.insertAfter(44, 45);

        assertEquals("Should be [44, 45, 56, 57, 23, 24]",
                "[44, 45, 56, 57, 23, 24]",
                testLL.toString()
        );
    }

    @Test public void testLLMultipleInsertBefore() {
        LinkedList testLL = new LinkedList();

        testLL.append(45);
        testLL.append(45);
        testLL.insertBefore(45, 34);
        testLL.insertBefore(45, 34);
        testLL.insertBefore(45, 34);
        testLL.insertAfter(34, 10);
        testLL.insertAfter(34, 10);
        testLL.insertAfter(34, 10);

        assertEquals("Should be [34, 10, 10, 10, 34, 34, 45, 45]",
                "[34, 10, 10, 10, 34, 34, 45, 45]",
                testLL.toString()
        );
    }

    @Test public void testLLMixInsertAppendInsertAfterInsertBefore1() {
        LinkedList testLL = new LinkedList();

        testLL.append(45);
        testLL.insertBefore(45, 34);
        testLL.insert(67);
        testLL.insertAfter(34, 22);
        testLL.append(87);
        testLL.insertAfter(87, 77);
        testLL.insertBefore(22, -73);

        assertEquals("Should be [67, 34, -73, 22, 45, 87, 77]",
                "[67, 34, -73, 22, 45, 87, 77]",
                testLL.toString()
        );
    }

    @Test public void testLLMixInsertAppendInsertAfterInsertBefore2() {
        LinkedList testLL = new LinkedList();

        testLL.append(66);
        testLL.append(99);
        testLL.insertBefore(66,33);
        testLL.insertBefore(33,46);
        testLL.insert(21);
        testLL.insert(14);
        testLL.insertAfter(99, 777);
        testLL.insertAfter(777, 59);
        testLL.append(90);

        assertEquals("Should be [14, 21, 46, 33, 66, 99, 777, 59, 90]",
                "[14, 21, 46, 33, 66, 99, 777, 59, 90]",
                testLL.toString()
        );
    }
}
