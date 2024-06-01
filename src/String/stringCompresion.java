package String;
import java.util.*;
public class stringCompresion {

    public static String rever(String str){
        String re = "";
        for(int i=0; i<str.length(); i++){
            char ch;
            ch = str.charAt(i);
            re = ch+re;
        }
        return re;
    }

    public static void main(String[] args) {
//        compression of string
        String str = " Hello My Name is Sumit ";
        String ans ="";
        StringBuilder sb = new StringBuilder("");

        String ss = rever(str);


        for(int i=0; i<ss.length(); i++) {
            char chh = ss.charAt(i);
            if (chh != ' ') {
                sb.append(chh);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }

        System.out.println(ans);
    }
}
