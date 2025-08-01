package ArrayPractice;
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = perm(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>>  perm(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(ans, new ArrayList<>(), arr);
        return ans;
    }

    public static void backTrack(List<List<Integer>> ans, ArrayList<Integer> permu, int[] arr){
        if(permu.size() == arr.length){
            ans.add(new ArrayList<>(permu));
            return;
        }

        for(int num : arr){
            if(permu.contains(num))  continue;

            permu.add(num);
            backTrack(ans, permu, arr);
            permu.remove(permu.size()-1);
        }
    }


}
