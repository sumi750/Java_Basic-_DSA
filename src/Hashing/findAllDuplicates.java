package Hashing;
import java.util.*;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1,2,9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) >= 2){
                System.out.print(i+" ");
            }
        }
    }
}
