package Sorting;
import java.util.*;
public class Selection_Sort {
    public static void select(int[] arr){
        //Select an element and put it into the right position
        //it is comparison based sorting algo
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            //find the index of smallest element
            int midIndex = 1;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[midIndex]){
                    midIndex = j;
                }
            }

            //Swap the minIndex element with first element
            int temp = arr[midIndex];
            arr[midIndex] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {

        //T.C --> O(N^2) {Average and Worst Both}
        int[] arr = {4,5,3,1,5,9,3,0,4,12,10};
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sorted Array ");
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
}
