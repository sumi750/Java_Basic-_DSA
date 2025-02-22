package Sorting;
import java.util.*;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {4,6,1,2,9,3,7,5,10,15,11};
        System.out.println("Unsorted Array " +Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println("Sorted Array " + Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k++] = left[i++];
            }

            else{
                mix[k++] = right[j++];
            }
        }

        //it may be left some of the array

        while(i < left.length){
            mix[k++] = left[i++];
        }

        while(j < right.length){
            mix[k++] = right[j++];
        }

        return mix;
    }
}
