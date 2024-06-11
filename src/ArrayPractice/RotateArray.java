package ArrayPractice;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Rotate Array By Kth times
        System.out.print("Enter the array");
        int size = 5;
        int arr[] = new int[size];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the value of K ");
        int k = sc.nextInt();
        int n = arr.length;

        k = k % n;


        // Reverse Code
        int ans[] = new int[n];
        int j = 0;  // for traversing
        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
