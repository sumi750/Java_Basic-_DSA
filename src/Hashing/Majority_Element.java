package Hashing;
import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int [] arr  = {1,5,6,1,2,8,9,2,1,2,2,2,2,1,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        Set<Integer> keys = map.keySet();

        for(int key : keys){
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }

    }
}
