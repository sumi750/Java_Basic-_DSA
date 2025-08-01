package Recursion;
import java.util.*;
public class ReverseString {

    //Method 1 for Reverse a String
    public static String ReverseS(String st, int idx){
        //Base Case
        if(idx == st.length()) return "";

        //Recursive Work
        String reverse = ReverseS(st, idx+1);
        //Self work
        return reverse+st.charAt(idx);

    }
    //Method 2 for Reverse a String
    static String reverse(String str){
        //Base Case : If the string is empty or only 1 element than return string
        if(str.isEmpty()) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(ReverseS(st,0));
        System.out.println(reverse(st));
    }
}
