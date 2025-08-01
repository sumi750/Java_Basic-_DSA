package ArrayPractice;

import java.util.HashMap;

public class LongestSubStringWORepeatC {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest Substring WO repeating Char " + longest(s));

    }

    public static int longest(String s){
        int n = s.length();
        if(n == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0;
        int maxLength = 0;

        for(int right = 0; right < n; right++){
            char c = s.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c)+1;
            }

            map.put(c, right);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

}


/*
import java.util.HashSet;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char current = s.charAt(right);
            if (!set.contains(current)) {
                set.add(current);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

 */
