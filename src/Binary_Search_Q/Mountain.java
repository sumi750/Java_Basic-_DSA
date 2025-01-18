package Binary_Search_Q;
import java.util.*;
public class Mountain {
    public static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){
                //We are in the Dec part of Array
                //This may be ans, but look at the left
                end = mid;
            }
            else{
                //you are in Asc part of Array,
                start = mid+1;  //because mid+1 > mid
            }
        }
        //in the end, start == end and pointing the largest element because the 2 checks of above
        //start and end always trying to find the max element in the above 2 checks
        return arr[start];  // or return arr[end]
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,8,7,3,0};
        System.out.println("Peak of the element is   "+ peakElement(arr));
    }
}
