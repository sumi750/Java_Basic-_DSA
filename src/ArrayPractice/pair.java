package ArrayPractice;
import java.util.*;
public class pair {
    // Print Pair
    public static void printPair(int[] numbers) {
        int tPair = 0;
        for (int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                tPair++;
            }
            System.out.println();
        }
        System.out.println("Total number of pair =  "+ tPair);
    }

    // SubArray
    public static void subArray(int[] number){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start ; k<=end; k++){
                    System.out.print(number[k]+" ");
                    sum = sum + number[k];
                }
                System.out.print(",Sum of the subArray is "+ sum);
                if(sum>maxSum){
                    maxSum = sum;
                }
                if(sum<minSum){
                    minSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum is "+ maxSum);
        System.out.println("Minimum sum of subArray is "+minSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int arr[] = new int[number];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // PAIR OF ARRAY
//        System.out.println("Pair of Array ");
//        printPair(arr);

        // PAIR OF SUB_ARRAY
        System.out.println(" SubArray");
        subArray(arr);
    }
}
