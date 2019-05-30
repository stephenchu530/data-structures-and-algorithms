package CodeChallenges401;

public class BinarySearch {
    public static int binarySearch(int[] arr, int n) {
        int start = 0, end = arr.length - 1, mid;

        if (arr.length == 0) { return -1; }
        if (n < arr[start] || n > arr[end]) { return -1; }

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == n) {
                return mid;
            }
            if (n < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
