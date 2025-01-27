package Sorting;
import java.util.*;

public class findAllMissing {
    public static List<Integer> findAll(int[] num){
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<num.length){
            int correct = num[i]-1;
            if(num[i] != num[correct]){
                int temp = num[i];
                num[i] = num[correct];
                num[correct] = temp;
            }
            else{
                i++;
            }
        }

        for(int index=0; index<num.length; index++){
            if(num[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {4,3,2,7,8,2,3,1};
        List<Integer> arr2 = findAll(num);

        for(int i=0; i<arr2.size(); i++){
            System.out.print(arr2.get(i)+" ");
        }

    }
}
