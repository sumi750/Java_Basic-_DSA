package Hashing;
import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int[] arr = {4,3,2,5,6,7,3,4,2,1};
        int[] arr2 = {7,3,9,6};
        for(int i : arr){
            set.add(i);
        }

        for(int i : arr2){
            set.add(i);
        }
        System.out.println("Union of Both arrays is ");
        for(int i : set){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Number of distinct is "+ set.size());

        System.out.println("Intersection of Arrays is ");
        for(int i: arr){
            set1.add(i);
        }

        for(int i: arr2){
            if(set1.contains(i)){
                inter.add(i);
            }
        }

        for(int num : inter){
            System.out.print(num+" ");
        }

    }
}
