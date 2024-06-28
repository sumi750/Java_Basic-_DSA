package String;
import java.util.*;
public class stringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine()); // remember

        System.out.println(str);
        for(int i=0; i<str.length(); i++){
            //P--> p
            // check -> alphabet -small, capital
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int)ch;
        }


    }
}
