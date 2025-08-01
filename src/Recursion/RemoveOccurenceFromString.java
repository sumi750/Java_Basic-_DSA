package Recursion;
import java.util.*;
public class RemoveOccurenceFromString {


    //Remove occur from string
    public static String removeO(String st, String newSt){
        // Base Case
        if(st.isEmpty()) return newSt;

        char ch = st.charAt(0);
        if(ch == 'a') return removeO(st.substring(1), newSt);
        else return removeO(st.substring(1), newSt+ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(removeO(st, ""));
    }
}
