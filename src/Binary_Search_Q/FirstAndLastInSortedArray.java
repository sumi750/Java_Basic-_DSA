package Binary_Search_Q;

import java.util.*;
public class FirstAndLastInSortedArray {
    public static int[] findIndex(int[] arr, int k){
        int[] ans = {-1,-1};

        int start = search(arr, k, true);
        int end = search(arr,k, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] arr, int k, boolean firstFind){
        int ans = -1;
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(k<arr[mid]){
                e = mid-1;
            }
            else if (k>arr[mid]) {
                s = mid+1;
            }

            else{
                ans = mid;
                if(firstFind){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,7,7,7,7,8,8,9,10};
        int k = sc.nextInt();
        int[] result = findIndex(arr,k);
        System.out.println(Arrays.toString(result));
    }
}
