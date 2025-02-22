package Recursion;
import java.util.*;
public class RemoveOccurenceFromString {


    //Remove occur from string
    public static String removeO(String st, int idx){
        // Base Case
        if(idx == st.length()) return "";

        //Recursive Work
        String smallA = removeO(st, idx+1);

        char currChar = st.charAt(idx);

        //self work
        if(currChar != 'a'){
            return currChar + smallA;
        }
        else{
            return smallA;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(removeO(st, 0));
    }
}
