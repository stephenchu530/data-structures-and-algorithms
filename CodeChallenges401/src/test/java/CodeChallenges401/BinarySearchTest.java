package CodeChallenges401;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearchMiddle() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1,2,3,4}, 3));
    }

    @Test public void testBinarySearchStart() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1,2,3,4}, 1));
    }

    @Test public void testBinarySearchEnd() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1,2,3,4}, 4));
    }

    @Test public void testBinarySearchSingle() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{33}, 33));
    }

    @Test public void testBinarySearchNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1,2,3,4}, 5));
    }

    @Test public void testBinarySearchSingleNotFoundLower() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{11}, 5));
    }

    @Test public void testBinarySearchSingleNotFoundUpper() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{11}, 20));
    }

    @Test public void testBinarySearch100() {
        int[] testArray = new int[100];

        for (int i = 0; i < 100; i++) {
            testArray[i] = i;
        }
        assertEquals(5, BinarySearch.binarySearch(testArray, 5));
        assertEquals(34, BinarySearch.binarySearch(testArray, 34));
        assertEquals(88, BinarySearch.binarySearch(testArray, 88));
        assertEquals(-1, BinarySearch.binarySearch(testArray, 983));
    }

    @Test public void testBinarySearch10000() {
        int[] testArray = new int[10000];

        for (int i = 0; i < 10000; i++) {
            testArray[i] = i;
        }
        assertEquals(23, BinarySearch.binarySearch(testArray, 23));
        assertEquals(3794, BinarySearch.binarySearch(testArray, 3794));
        assertEquals(8847, BinarySearch.binarySearch(testArray, 8847));
        assertEquals(-1, BinarySearch.binarySearch(testArray, -1));
    }

    @Test public void testBinarySearch100000() {
        int[] testArray = new int[100000];

        for (int i = 0; i < 100000; i++) {
            testArray[i] = i;
        }
        assertEquals(204, BinarySearch.binarySearch(testArray, 204));
        assertEquals(59298, BinarySearch.binarySearch(testArray, 59298));
        assertEquals(92858, BinarySearch.binarySearch(testArray, 92858));
        assertEquals(-1, BinarySearch.binarySearch(testArray, 394823098));
    }
}
