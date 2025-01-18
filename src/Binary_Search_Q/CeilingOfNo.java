package Binary_Search_Q;

import java.util.*;

public class CeilingOfNo {
    public static int ceiling(int[] arr, int t){
        if(t > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == t){
                return mid;
            }
            else if (arr[mid] < t) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return start;  // pointing to the smallest number >= target (Ceiling of Number)
        /*
        if we return end from this than we get the Floor of Target Element
         */

    }

    public static void main(String[] args) {

        /*The ceiling of a number is the smallest number in a sorted array
         that is greater than or equal to the target number.
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,9,10,15,20,25,29,30};
        int target = sc.nextInt();
        int result = ceiling(arr, target);
        if(result != -1){
            System.out.println("Ceiling of "+ target + " is "+ arr[result]);
        }
        else{
            System.out.println("No Ceiling found for "+ target);
        }
    }
}
