package ArrayPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestConSeq {
    public static void main(String[] args) {
        int[] arr = {1,101,2,105,3,8,4,106,9};
        System.out.println("Count of Longest Con Sequence is " +  longest(arr));
    }

    public static int longest(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr) set.add(val);
        int result = 1;

        for(int val : arr){
            if(set.contains(val) && !set.contains(val-1)){
                int curr = val;
                int count = 0;
                while(set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    count++;
                }
                result = Math.max(count, result);
            }
        }

        return result;
    }
}
