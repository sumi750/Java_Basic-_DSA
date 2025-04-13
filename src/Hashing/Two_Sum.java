package Hashing;
import java.util.*;

import java.util.HashMap;

public class Two_Sum {

    public static int[] two_sum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int req_num = target - arr[i];
            if(map.containsKey(req_num)){
                int[] arr1 = {map.get(req_num), i};
                return arr1;
            }
            else{
                map.put(arr[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = two_sum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
