package ArrayPractice;
import java.util.*;
public class subarray {
    public static void MaxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int prefix[] =  new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<prefix.length; i++){
            int start = i;
            for(int j=i; j<prefix.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(currSum >maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is "+ maxSum);
    }
    // Kadaan's Algorithm
    public static void kadanSum(int arr[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
//            maxSum = Math.max(currSum, maxSum);
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("our max su  is : " + maxSum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sum Of SubArray Using Prefix Method
        System.out.print("Enter the value of N ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        MaxSubArray(arr);
        kadanSum(arr);
        sc.close();
    }
}
