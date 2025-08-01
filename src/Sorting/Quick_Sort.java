package Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array is " + Arrays.toString(arr));;
    }

    public static void sort(int[] arr, int low , int high){
        if(low < high){
            int PI = part(arr, low, high);

            sort(arr, low, PI-1);   //left Half
            sort(arr, PI+1, high);   //right half
        }
    }

    private static int part(int[] arr, int low, int high){
        int idx = low-1;
        int pivot = arr[high];

        for(int i=low; i<high; i++){
            if(arr[low] <= pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[high];
        arr[high] = temp;

        return idx;
    }


}
