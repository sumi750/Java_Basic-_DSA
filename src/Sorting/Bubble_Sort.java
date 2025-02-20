package Sorting;
import java.util.*;
public class Bubble_Sort {
    public static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i < arr.length-1; i++){
            swapped = false;
            //For each step, max item will at the last respective index
            for(int j=0; j < arr.length-i-1; j++){
                //swap if prev item is larger than next
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    //Bubble Sort using Recursion
    static void bubble2(int[] arr, int length, int c){
        if(length == -1) return;
        if(c < length){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble2(arr,length, c+1);
        }

        else{
            bubble2(arr, length-1, 0);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,4,6,3,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1,4,5,3,9,7,6};
        bubble2(arr2,arr.length, 0);
        System.out.println(Arrays.toString(arr2));
    }
}
