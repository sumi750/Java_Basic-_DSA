package Recursion;

public class Stream {

    //Printing String w/o a
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }

        else{
            skip(p+ch, up.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "bbaaccdaesea";
        skip("", str);

        String s2 = "bashancakala";
        System.out.println(skipC(s2));
    }

    //Returning String
    static String skipC(String up){
        if(up.isEmpty()){
            return " ";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipC(up.substring(1));
        }

        else{
            return ch + skipC(up.substring(1));
        }
    }
}
