package String;
import java.util.*;
public class removeDuplicate {
    public static String remove(String st){
        String name = st;
        StringBuilder sb = new StringBuilder(" ");
        boolean[] seen = new boolean[255];
        for(int i = 0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(!seen[ch]){
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String ss = remove(str);
        System.out.println(ss);
    }
}
