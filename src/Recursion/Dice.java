package Recursion;
import java.util.*;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceList("", 4));
    }

    public static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target; i++){
            dice(p+i, target-i);
        }
    }

    public static ArrayList<String> diceList(String p, int target){
        if(target == 0 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=6 && i <= target; i++){
            ans.addAll(diceList(p+i, target-i));
        }

        return ans;
    }
}
