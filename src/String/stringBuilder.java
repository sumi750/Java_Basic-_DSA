package String;
import java.util.*;
public class stringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine()); // remember

        System.out.println(str);

//        // hello -> mello
//        str.setCharAt(0,'m');
//        System.out.println(str);   //mello
//        str.insert(1,'p');
//        System.out.println(str); //mpello
//        str.deleteCharAt(0);
//        System.out.println(str); //pello
//
//        str.reverse();
//        System.out.println(str); //ollep
//
//        str.append(" world");
//        System.out.println(str);
//
//        str.delete(2,6); // (start, end-1)
//        System.out.println(str);

        // toggle the all char of string
//        SumiT -->sUMIt
        for(int i=0; i<str.length(); i++){
            //P--> p
            // check -> alphabet -small, capital
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int)ch;
        }


    }
}
