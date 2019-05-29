package CodeChallenges401;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int value) {
        int newArray[] = new int[inputArray.length + 1];
        int i;
        int odd = inputArray.length % 2;

        for (i = 0; i < inputArray.length / 2 + odd; i++) {
            newArray[i] = inputArray[i];
        }

        newArray[i] = value;
        i++;

        for (; i < inputArray.length + 1; i++) {
            newArray[i] = inputArray[i - 1];
        }

        return newArray;
    }
}
