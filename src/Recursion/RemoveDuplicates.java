package Recursion;
import java.util.*;
public class RemoveDuplicates {
    public static void removeD(String st, int idx, StringBuilder sb, boolean[] seen){

        if(idx == st.length()) {
            System.out.println(sb);
            return;
        }

        char ch = st.charAt(idx);
        if(seen[ch-'a'] == true){
            removeD(st,idx+1,sb, seen);
        }
        else{
            seen[ch-'a'] = true;
            removeD(st, idx+1, sb.append(ch), seen);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        boolean[] arr = new boolean[26];
        removeD(st,0,new StringBuilder(""), arr);
    }
}
