package Hashing;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("America", 50);
        hm.put("USA", 50);
        hm.put("Sri Lanka", 20);
        System.out.println(hm);

        int pop = hm.get("India");
        System.out.println("Population of India is "+ pop);

        if(hm.containsKey("China")){
            System.out.println("China is Exists in data ");
        }

        hm.remove("America");

        //Iteration in HM --> Set stores the key value of HM
        Set<String> keys = hm.keySet();

        for(String key : keys){
            System.out.println("Key = "+ key + ", Value= "+hm.get(key));
        }

    }
}
