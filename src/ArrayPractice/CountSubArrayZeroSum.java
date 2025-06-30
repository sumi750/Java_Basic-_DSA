package ArrayPractice;
import java.util.*;

public class CountSubArrayZeroSum {
    public static int countSubarraysWithZeroSum(int[] nums) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        int count = 0;
        int prefixSum = 0;

        // Initialize with sum 0 having frequency 1
        prefixSumFreq.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (prefixSumFreq.containsKey(prefixSum)) {
                count += prefixSumFreq.get(prefixSum);
            }

            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static int Length(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];

            if(prefixSum == 0) maxLength = i+1;

            if(map.containsKey(prefixSum)){
                maxLength = Math.max(maxLength, i-map.get(prefixSum));
            }
            else{
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println("Total subarrays with sum = 0: " + countSubarraysWithZeroSum(arr));
        System.out.println("length of longest subarray with sum  0 : " + Length(arr));
    }
}

