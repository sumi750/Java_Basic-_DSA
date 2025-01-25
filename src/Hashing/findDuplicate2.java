package Hashing;
import java.util.*;

public class findDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i])-1;

            if(arr[index] < 0){
                list.add(Math.abs(arr[i]));
            }
            else{
                arr[index] = -arr[index];
            }
        }

        for(int i: list){
            System.out.print(i+" ");
        }

    }



}
