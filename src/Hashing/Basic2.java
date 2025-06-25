package Hashing;
import java.util.*;

public class Basic2 {
    public static void main(String[] args) {

        //HashSet is work in unordered Way --> store distinct items
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Ludhiana");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Noida");

        for(String city: cities){
            System.out.println(city);
        }
    }
}
