package ArrayPractice;
import java.net.Inet4Address;
import java.util.*;

public class CountSubArrayWithTargetK {
    public static void main(String[] args) {
        int[] arr = {1, 1,1};
        int k = 3;
        System.out.println("Count of subarrays with sum = " + k + ": " + countSubarraysWithSumK(arr, k));
        System.out.println("Count of subarrays with sum = " + k + ": " + LengthSubarraysWithSumK(arr, k));
    }

    public static int LengthSubarraysWithSumK(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefix = 0;

        for(int i=0; i<arr.length; i++){
            prefix += arr[i];

            if(prefix == k){
                maxLength = i+1;
            }

            if(map.containsKey(prefix-k)){
                maxLength = Math.max(maxLength, i- map.get(prefix-k));
            }

            if(!map.containsKey(prefix)){
                map.put(prefix, i);
            }

        }
        return maxLength;

    }


    public static int countSubarraysWithSumK(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefix = 0;

        map.put(0,1);

        for(int num : arr){
            prefix += num;

            if(map.containsKey(prefix-k)){
                count += map.get(prefix-k);
            }

            map.put(prefix, map.getOrDefault(prefix, 0)+1);
        }
        return count;
    }


}
