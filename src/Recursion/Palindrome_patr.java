package Recursion;
import java.util.*;

public class Palindrome_patr {
    public static void main(String[] args) {
        String str = "abcaba";
        ArrayList<ArrayList<String>> ans = palin_p(str);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<String>> palin_p(String str){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> combin = new ArrayList<>();
        getAll(ans, combin, str);
        return ans;
    }

    public static void getAll(ArrayList<ArrayList<String>> ans, ArrayList<String> combin, String str){
        if(str.length() == 0){
            ans.add(new ArrayList<>(combin));
            return;
        }

        for(int i=0; i<str.length(); i++){
            String part = str.substring(0, i+1);

            if(isPalin(part)){
                combin.add(part);
                getAll(ans, combin, str.substring(i+1));
                combin.remove(combin.size()-1);
            }
        }
    }

    public static boolean isPalin(String st){
        int left = 0;
        int right = st.length()-1;
        while(left < right){
            if(st.charAt(left) != st.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
