package CodeChallenges401;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testArrayShiftEven() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[]{1,2,3,4};
        int value = 20;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{1,2,20,3,4}, newArray);
    }

    @Test
    public void testArrayShiftOdd() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[]{1,2,3,4,5};
        int value = 20;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{1,2,3,20,4,5}, newArray);
    }

    @Test
    public void testArrayShiftSingle() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[]{1};
        int value = 20;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{1,20}, newArray);
    }

    @Test
    public void testArrayShiftEmpty() {
        ArrayShift classUnderTest = new ArrayShift();
        int inputArray[] = new int[0];
        int value = 20;
        int newArray[] = classUnderTest.insertShiftArray(inputArray, value);
        assertArrayEquals(new int[]{20}, newArray);
    }
}
