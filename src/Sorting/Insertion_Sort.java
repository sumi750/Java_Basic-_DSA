package Sorting;
import java.util.*;
public class Insertion_Sort {
    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];  //the current element to be inserted
            int j = i-1;

            while(j >= 0 && arr[j] > curr){
                    arr[j+1] = arr[j];
                    j--;
            }

            //Insert the key element in the correct position
            arr[j+1] = curr;

        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,1,9,7,3,15,11,12};
        System.out.println("Original Sorted ");
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println("Sorted Array ");
        System.out.println(Arrays.toString(arr));

    }
}
