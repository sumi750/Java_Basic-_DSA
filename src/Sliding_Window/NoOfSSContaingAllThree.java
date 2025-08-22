package Sliding_Window;
import java.util.*;
import java.util.Scanner;

public class NoOfSSContaingAllThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "bbaacbcba";
        System.out.println("No of Substring containing  all 3 "  + contain(st));
    }

    public static int contain(String s){
        int count = 0;
        int[] lastSeen = {-1,-1,-1};

        for(int i=0; i<s.length(); i++){
            lastSeen[s.charAt(i)-'a'] = i;

            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count = count +  (1+Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
            }
        }
        return count;
    }
}
