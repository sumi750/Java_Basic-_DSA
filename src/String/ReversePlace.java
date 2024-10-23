package String;
import java.util.*;
public class ReversePlace {
    public static String Anti(String str1, int place){
        int len = str1.length();
        place = place % len;

        String first = str1.substring(place);
        String second = str1.substring(0, place);
        return first+second;

    }

    public static String Clock(String str1, int place){
        int len = str1.length();
        place = place % len;

        String first = str1.substring(len-place);
        String second = str1.substring(0,len-place);
        return first+second;
    }


    public static void main(String[] args) {
        String str1 = "SumitKumar";
        String str2 = "arSumitKum";
        int place = 2;
        String ss = Anti(str1, place);
        String aa = Clock(str1, place);

        if(ss.equals(str2)){
            System.out.println("Yes");
        }
        else if (aa.equals(str2)) {
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }

    }
}
