package String;
import java.util.*;
public class stringC {
    public static String compress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer cnt = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                cnt++;
                i++;
            }
            newStr += str.charAt(i);
            if(cnt >1){
                newStr += cnt.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compress(str));
    }
}
