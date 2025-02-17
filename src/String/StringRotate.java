package String;
import java.util.*;
public class StringRotate {
    public static boolean rotate(String s1, String s2){

        return s1.length() == s2.length() && (s1+s2).contains(s2);
    }
    public static void main(String[] args) {
        String str1 = "Sumitkumar";
        String str2 = "mitkumarSu";

        boolean inform = rotate(str1, str2);
        if(inform) System.out.println("Yes");
        else System.out.println("No");

    }
}
