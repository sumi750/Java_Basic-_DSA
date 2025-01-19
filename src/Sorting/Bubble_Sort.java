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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
