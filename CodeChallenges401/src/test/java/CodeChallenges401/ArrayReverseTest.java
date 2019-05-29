package CodeChallenges401;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ArrayReverseTest {
    @Test public void testReverseArray() {
        ArrayReverse classUnderTest = new ArrayReverse();
        // create the array to test your code on later
        int[] startArr = new int[] {1,2,3,4,5,10};
        // call your reverseArray method and save the result in a variable
        int[] endArr = classUnderTest.reverseArray(startArr);
        // print out the result, nicely
        assertArrayEquals(new int[]{10, 5, 4, 3, 2, 1}, endArr);
    }
}
