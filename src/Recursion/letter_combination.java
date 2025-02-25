package Recursion;
import java.util.*;
public class letter_combination {
    public static void main(String[] args) {
        System.out.println(padRet("", "12"));
    }

    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a'+i);
            ans.addAll(padRet(p+ch, up.substring(1)));
        }

        return ans;
    }
}
