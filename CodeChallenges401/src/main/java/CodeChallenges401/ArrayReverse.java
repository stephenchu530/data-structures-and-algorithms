package CodeChallenges401;

public class ArrayReverse {
    public static int[] reverseArray(int[] inputArray) {
        int[] result = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            result[i] = inputArray[inputArray.length - 1 - i];
        }
        return result;
    }
}
