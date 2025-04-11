package ArrayPractice;

import java.util.Arrays;

public class nextPermutation {

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }


    public static void next(int[] arr){
        int pivot = -1;
        int n = arr.length;  //6
        for(int i = n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(arr);  // rearrange the numbers into the lowest possible order
            return;
        }

        //find the right most el > pivot
        for(int i = n-1; i>pivot; i--){
            if(arr[i] > arr[pivot]){
                arr[i] = arr[i] + arr[pivot];
                arr[pivot] = arr[i] - arr[pivot];
                arr[i] = arr[i] - arr[pivot];
                break;
            }
        }

        int i=pivot+1; int j = n-1;
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0};
        next(arr);
        System.out.println(Arrays.toString(arr));
    }
}
