package String;
import java.util.*;
public class StringCommpression2 {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0, j = 0; i<n; i=j){
            int count = 0;
            while(j<n && str.charAt(j) == str.charAt(i) && count < 9){
                j++;
                count++;
            }
            if(count == 1) sb.append(str.charAt(i));
            else sb.append(str.charAt(i)).append(String.valueOf(count));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();

        System.out.println("Compressed String is "+ compress(str));

    }
}
