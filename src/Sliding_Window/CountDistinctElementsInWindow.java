package Sliding_Window;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CountDistinctElementsInWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,5,7,1,6,1,6,9};
        int k = 4;
        System.out.println(count(arr, k));
    }

    public static ArrayList<Integer> count(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        ans.add(map.size());

        for(int i=k; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map.put(arr[i-k], map.get(arr[i-k])-1);

            if(map.get(arr[i-k]) == 0){
                map.remove(arr[i-k]);
            }

            ans.add(map.size());
        }

        return ans;
    }
}
