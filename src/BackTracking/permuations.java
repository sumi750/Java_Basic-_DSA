package BackTracking;
import java.util.*;

public class permuations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = perm(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> perm(int[] arr){
        List<List<Integer>> result = new ArrayList<>();

        backTrack(result, new ArrayList<>(), arr);
        return result;
    }

    public static void backTrack(List<List<Integer>> result, ArrayList<Integer> template, int[] arr){
        if(template.size() == arr.length){
            result.add(new ArrayList<>(template));
            return;
        }

        for(int a : arr){
            if(template.contains(a)) continue;
            template.add(a);
            backTrack(result, template, arr);
            template.remove(template.size()-1);
        }
    }

}
