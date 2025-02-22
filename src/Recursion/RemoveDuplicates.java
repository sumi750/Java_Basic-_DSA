package Recursion;
import java.util.*;
public class RemoveDuplicates {
    public static void removeD(String st, int idx, StringBuilder sb, boolean[] seen){

        if(idx == st.length()) {
            System.out.println(sb);
            return;
        }

        char ch = st.charAt(idx);
        if(seen[ch]){
            removeD(st,idx+1,sb, seen);
        }
        else{
            seen[ch] = true;
            removeD(st, idx+1, sb.append(ch), seen);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        boolean[] arr = new boolean[256];
        removeD(st,0,new StringBuilder(), arr);
        System.out.println(remove(st));
    }

    //Method 2 Returning of String
    static String remove(String str){
        boolean[] visit = new boolean[256];  //to track visited char
        return removeDuplicate(str, 0, visit);
    }

    private static String removeDuplicate(String str, int index, boolean[] visit){
        if(index == str.length()){
            return "";
        }

        char curr = str.charAt(index);
        if(visit[curr]){
            return removeDuplicate(str, index+1, visit);
        }

        else{
            visit[curr] = true;
            return curr + removeDuplicate(str, index+1, visit);
        }
    }

}
