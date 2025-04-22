package Hashing;
import javax.sound.midi.Soundbank;
import java.util.*;

public class Operation_Array {

    public static List<Integer> union(int[] arr, int[] arr2){

        //Because sets store only unique elements
        Set<Integer> result = new HashSet<>();

        for(int num : arr){
            result.add(num);
        }

        for(int num : arr2){
            result.add(num);
        }
        return new ArrayList<>(result);
    }


    public static List<Integer> inter(int[] arr, int[] arr2){
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num : arr){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)) result.add(num);
        }

        return result;
    }

    public static List<List<Integer>> difference(int[] arr, int[] arr2){

        //set1 - set2 &7 set2 - set1
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : arr){
            set1.add(num);
        }

        for(int num : arr2){
            set2.add(num);
        }

        Set<Integer> diff1 = new HashSet<>(set1);
        Set<Integer> diff2 = new HashSet<>(set2);

        diff1.removeAll(set2);
        diff2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>(diff1));
        result.add(new ArrayList<>(diff2));

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,8,5,3,9,8,3};
        int[] arr2 = {1,8,9,3,4,7,0};

        System.out.println("Union of Both Arrays " + union(arr, arr2));
        System.out.println("Intersection of Both Arrays " + inter(arr, arr2));
        System.out.println("difference of Both Arrays " + difference(arr, arr2));
    }
}
