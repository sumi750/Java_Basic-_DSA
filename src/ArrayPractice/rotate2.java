package ArrayPractice;
import java.util.*;
public class rotate2 {

    public static void reverse(int arr[],int first, int last){
//        int first = 0, last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void replace(int arr[], int k)
    {
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void printA(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // rotate array without using extra space
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int k = 3;
//        reverse(arr,k);
        replace(arr,k);
        printA(arr);

    }
}
