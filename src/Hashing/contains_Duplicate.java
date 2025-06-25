package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class contains_Duplicate {
    public static boolean isDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int a : arr){
            if(set.contains(a)) return true;
            set.add(a);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        System.out.println(isDuplicate(arr));
    }
}
