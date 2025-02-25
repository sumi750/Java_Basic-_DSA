package Recursion;
import java.util.*;

public class Permutation_Set {
    public static void main(String[] args) {
        //No. of recursive call == size of processed +1
        String str = "abc";
        ArrayList<String> ans = permutation("", str);
        System.out.println(ans);
    }

    static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);  // i --> p.length()
            ans.addAll(permutation(f+ch+s, up.substring(1)));
        }
        return ans;
    }


}
