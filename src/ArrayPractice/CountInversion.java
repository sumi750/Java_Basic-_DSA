package ArrayPractice;
import java.util.*;

public class CountInversion {

    public static void main(String[] args) {
//        int[] arr = {4, 6, 1, 2, 9, 3, 7, 5, 10, 15, 11};
        int[] arr = {2,4,1,3,5};
        System.out.println("Total Inversions: " + countInversions(arr));
    }

    static int countInversions(int[] arr) {
        return mergeSortAndCount(arr);
    }

    static int mergeSortAndCount(int[] arr) {
        if (arr.length <= 1) return 0;

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int count = mergeSortAndCount(left);
        count += mergeSortAndCount(right);
        count += mergeAndCount(left, right, arr); // merge into original arr

        return count;
    }

    static int mergeAndCount(int[] left, int[] right, int[] merged) {
        int i = 0, j = 0, k = 0, count = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
                count += (left.length - i); // All remaining left[] elements form inversions
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return count;
    }
}
