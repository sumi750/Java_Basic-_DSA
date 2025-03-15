package Recursion;
import java.util.*;

public class combination_Sum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,2};
        int target = 10;
        ArrayList<ArrayList<Integer>> ans = combination(arr, target);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> combination(int[] arr, int target){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        ArrayList<Integer> comb = new ArrayList<>();
        getAll(arr, target, 0, ans, comb);
        return ans;
    }

    public static void getAll(int[] arr, int target, int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> comb){

        //base case
        if(target < 0) return;
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }


        for(int i=index; i<arr.length; i++){

            //Handling duplicates
            if(i>index && arr[i] == arr[i-1]) continue;
            if(target-arr[i] < 0) break;
            comb.add(arr[i]);
            getAll(arr, target-arr[i], i+1, ans, comb);
            comb.remove(comb.size()-1);
        }
    }
}
