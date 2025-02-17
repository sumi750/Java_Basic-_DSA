package String;
import java.util.*;

public class hacker{
    static boolean isAnagram(String a, String b) {
        // Change into Lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        // into char Array
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        int n = x.length;
        int m = y.length;

        if(n != m){
            return false;
        }

        // Sort the Arrays using bubble sort
        for(int i =0; i<x.length; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[j]>x[i]){
                    char temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                }

            }
        }

        for(int i =0; i<y.length; i++){
            for(int j=i+1; j<y.length; j++){
                if(y[j]>y[i]){
                    char temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;

                }

            }
        }

        for(int i=0; i<n; i++){
            if(x[i] != y[i]){
                return false;
            }
        }

        for(int i=0; i<n; i++){
            if(x[i] != y[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String");
        String a = scan.next();
        System.out.println("Enter the Second String");
        String b = scan.next();
//        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "The strings are Anagrams" : "The Strings are Not Anagrams" );
    }
}