package Greedy_Algo;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_Coins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Amt ");
        int amt = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int num : coins){
            if(num <= amt){
                while(num<=amt){
                    countOfCoins++;
                    ans.add(num);
                    amt -= num;
                }
            }
        }

        System.out.println("No of Coins/notes used " + countOfCoins);
        System.out.println(ans);

    }
}
