package Recursion;
import java.util.*;
public class RemoveDuplicates {
    public static String removeD(String st, int idx, String result){

        if(idx == st.length()) return result;

        char ch = st.charAt(idx);

        if(result.indexOf(ch) == -1){
            result += ch;
        }

        return removeD(st, idx+1, result);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(removeD(st,0,""));
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
