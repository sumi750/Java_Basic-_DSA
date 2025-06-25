package Hashing;

import java.util.HashMap;

public class FirstUniqueChar {
    public static int firstUnique(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "alleetcode";
        int index = firstUnique(s);
        System.out.println( "First unique char is " + s.charAt(index) + " and its index is " + index);
    }
}
