package Recursion;

import java.util.ArrayList;

public class subSequences {
    public static void main(String[] args) {
        String str = "abc";
        subS("", str);
        System.out.println(subSeq("", str));
        subSAscii("", str);
    }


    //Printing the SubSeq
    static void subS(String p , String str){
        if(str.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);
        subS(p+ch, str.substring(1)); //take it
        subS(p, str.substring(1));   //ignore it
    }

    //Returning the arrayList of All SubSeq
    static ArrayList<String> subSeq(String p, String str){
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subSeq(p+ch, str.substring(1)); //take it
        ArrayList<String> right = subSeq(p, str.substring(1));  //ignore it

        left.addAll(right);

        return left;
    }

    //Print ASCII value within
    static void subSAscii(String p , String str){
        if(str.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);
        subSAscii(p+ch, str.substring(1)); //take it
        subSAscii(p, str.substring(1));   //ignore it
        subSAscii(p + (ch+0), str.substring(1));
    }
}
