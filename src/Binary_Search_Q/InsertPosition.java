package Binary_Search_Q;
import java.util.*;
public class InsertPosition {
    public static int searchInsert(int[] arr, int k){
        int s = 0;
        int l = arr.length-1;
        while(s<=l){
            int mid = (s+l)/2;
            if(arr[mid] == k) {
                return mid;
            }
            if(arr[mid] < k){
                s = mid+1;
            }
            else{
                l = mid-1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,6};
        int n = sc.nextInt();
        int result = searchInsert(arr, n);

        System.out.println("Index of "+ n + "is of May be "+ result);
    }
}
