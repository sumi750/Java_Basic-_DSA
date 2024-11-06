package Recursion;
import java.util.*;
public class MaxValueArray {

    //Max Value in Array
    public static int maxValue(int[] arr, int idx){
        if(idx == arr.length-1) return arr[idx];

        //small problem
        int smallAns = maxValue(arr, idx+1);

        // self work
        return Math.max(arr[idx], smallAns);
    }


    //Print Array
    public static void PrintArray(int[] arr, int idx){
        if(idx == arr.length) return;

        //self work
        System.out.print(arr[idx] + " ");

        //small problem
        PrintArray(arr, idx+1);
    }

    //Sum Of Array
    public static int SumArray(int[] arr, int idx){
        //Base Case
        if(idx == arr.length-1){
            return arr[idx];
        }

        //Self work
        return arr[idx] + SumArray(arr, idx+1);
    }


    //Target Element
    public static boolean target(int[] arr, int t, int idx){
        //Base case
        if(idx >= arr.length) return false;

        //self work
        if(arr[idx] == t) return true;

        //recursive
        return target(arr,t,idx+1);   //Boolean Function
    }


    //First Occur
    public static int FirstOccur(int[] arr, int target, int idx){
        //Base Case
        if(idx == arr.length) return -1;

        //self Work
        if(arr[idx] == target) return idx;

        //Recursion
        return FirstOccur(arr, target, idx+1);
    }

    //IsSorted
    public static Boolean isSorted(int[] arr, int idx){
        //Base Case
        if(idx == arr.length-1) return true;

        if(arr[idx] > arr[idx+1]) return false;
        return isSorted(arr, idx+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,10,60};
        System.out.println("Target is ");
        int t = sc.nextInt();
        PrintArray(arr, 0);
        System.out.println();
        System.out.println("Max Value in Array Is " +  maxValue(arr, 0));
        System.out.println("Sum of array is " + SumArray(arr, 0));
        System.out.println(target(arr,t, 0));
        System.out.println(FirstOccur(arr,96, 0 ));
        System.out.println(isSorted(arr,0));
    }
}
