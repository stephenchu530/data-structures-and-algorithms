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

    @Test public void testBinarySearchNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1,2,3,4}, 5));
    }

    @Test public void testBinarySearch100() {
        int[] testArray = new int[100];

        for (int i = 0; i < 100; i++) {
            testArray[i] = i;
        }
        assertEquals(5, BinarySearch.binarySearch(testArray, 5));
        assertEquals(34, BinarySearch.binarySearch(testArray, 34));
        assertEquals(88, BinarySearch.binarySearch(testArray, 88));
    }
}
