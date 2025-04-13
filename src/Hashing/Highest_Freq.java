package Hashing;
import java.util.*;
import java.util.HashMap;

public class Highest_Freq {
    public static void main(String[] args) {
        int[] arr = {1,5,6,1,2,2,1,8,5,4,8,9,1};
        int maxFreq = 0;
        int mostFreq = arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            int count = map.getOrDefault(num,0)+1;
            map.put(num, count);

            if(count > maxFreq){
                maxFreq = count;
                mostFreq = num;
            }
        }

        System.out.println(mostFreq);
    }
}
