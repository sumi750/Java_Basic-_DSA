package Greedy_Algo;
import java.util.*;


public class LemonadeChange {

    public static boolean change(int[] arr){
        int five = 0;
        int ten= 0;
        int twenty = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 5) five++;
            else if(arr[i] == 10 ){
                if(five > 0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five >= 3){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {5,5,5,10,20};
        int[] arr2 = {5,5,10,10,20};

        System.out.println("For arr " + change(arr));
        System.out.println("For arr2 " + change(arr2));
    }
}
