package Sliding_Window;
import java.util.*;

public class LongestSubStringWOReapting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        System.out.println("Longest SubString without repeating char " + sub(str));
    }

    public static int sub(String st){
        int n = st.length();
        int left = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < n; right++){
            char c = st.charAt(right);
            if(map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + right;    //slide the window
            }

            map.put(c, right);
            maxLength = Math.max(maxLength, right - left +1);
        }

        return maxLength;
    }
}
