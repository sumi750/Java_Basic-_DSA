package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void sortC(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2,7,6};
        sortC(arr);
        System.out.println(Arrays.toString(arr));
    }
}
