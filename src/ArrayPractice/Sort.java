package ArrayPractice;

import java.util.*;

 public class Sort {

    // Bubble Sort
    public static void bubble(int arr[]){

        int temp;
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort

    public static void sel(int arr[]){

        for(int i=0; i< arr.length-1; i++){
            int small = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insert(int arr[]){
        for (int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out the correct pos to inert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input of the array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        // printing the array

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Bubble Sort: ");
        bubble(arr);        // bubble sort Calling
//        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sel(arr);  // Selection Sort Calling
        System.out.println();
        System.out.println("Selection Sort: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        insert(arr);  // Insertion Sort Calling
        System.out.println("Insertion Sort: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

