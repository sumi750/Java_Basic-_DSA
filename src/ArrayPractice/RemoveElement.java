package ArrayPractice;
import java.util.*;
public class RemoveElement {
    public static int remove(int arr[], int val){
        int count =0;
        int v = val;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=v){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,23};
        int val = 3;
        System.out.println(remove(arr, val));
    }
}
