package Sliding_Window;
import java.util.*;
import java.util.Scanner;

public class LongestSSAtmostKDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        System.out.println("Length of subString " + subS(str, k));
    }

    public static int subS(String s, int k){
        if(k == 0) return 0;

        int start = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char d = s.charAt(start);
                map.put(d, map.get(d) - 1);
                if (map.get(d) == 0) map.remove(d);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;

    }

    /*
        for Exactly k ---> return atMost(s, k) - atMost(s, k-1);
     */
}
