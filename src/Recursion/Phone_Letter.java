package Recursion;
import java.util.*;

class Phone_Letter {

    // Keypad mapping (index = digit)
    private static final String[] KEYPAD = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    private static void backtrack(List<String> combinations, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = KEYPAD[digit];

        for (char letter : letters.toCharArray()) {
            current.append(letter);                          // Choose
            backtrack(combinations, current, digits, index + 1); // Explore
            current.deleteCharAt(current.length() - 1);      // Un-choose (Backtrack)
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }

        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }
}

