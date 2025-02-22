package Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array is " + Arrays.toString(arr));;
    }

    static void sort(int[] arr, int low, int high){
        if(low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            //check condition again
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        //now pivot is at correct position, sort two halves
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
