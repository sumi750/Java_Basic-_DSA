package ArrayPractice;
import java.util.*;

public class Reverse_Pairs {
    public static void main(String[] args) {
        int[] arr = {5,2,4,9,3,4,1,10};
        int count = reversePairs(arr);
        System.out.println(count);

    }
    public static int reversePairs(int[] nums) {
        if(nums.length <= 0) return 0;
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low >= high) return 0;

        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);

        count += countPairs(arr, low, mid, high);

        merge(arr, low , mid, high);
        return count;
    }

    public static int countPairs(int[] arr, int low, int mid,  int high){
        int right = mid+1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && arr[i] > 2L * (arr[right])){
                right++;
            }
            count += (right - (mid+1));
        }
        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int i=low, j=mid+1;
        List<Integer> temp = new ArrayList<>();
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]) temp.add(arr[i++]);
            else temp.add(arr[j++]);
        }

        while(i <= mid) temp.add(arr[i++]);
        while(j <= high) temp.add(arr[j++]);

        for(int k=low; k<=high; k++){
            arr[k] = temp.get(k-low);
        }
    }

}

