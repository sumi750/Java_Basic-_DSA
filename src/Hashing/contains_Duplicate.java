package Hashing;

import java.util.HashMap;

public class contains_Duplicate {
    public static boolean isDuplicate(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num , 1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,9,6,4,7};
        System.out.println(isDuplicate(arr));
    }
}
