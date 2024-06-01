package String;
import java.util.*;
public class anagrams {

    public static boolean ana(char a[], char b[]){
        int n1 = a.length;
        int n2 = b.length;

        if(n1 !=n2){
            return false;
        }
        for(int i=0; i<n1; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String");
        String str1 = sc.next();
        System.out.println("Enter the Second String");
        String str2 = sc.next();

        // change into charArray
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
//        System.out.println(a[0]);

        // Sort the charArray
        Arrays.sort(a);
        Arrays.sort(b);

        boolean an = ana(a,b); // function for anagrams : call
        if(an){
            System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }

    }
}
