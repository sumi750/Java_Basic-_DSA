package Recursion;
import java.util.*;
public class ReverseString {
    public static String ReverseS(String st, int idx){
        //Base Case
        if(idx == st.length()) return "";

        //Recursive Work
        String reverse = ReverseS(st, idx+1);
        //Self work
        return reverse+st.charAt(idx);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(ReverseS(st,0));
    }
}
