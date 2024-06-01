package String;
import java.util.*;
public class reverse {

    // Palindrome Function
    public static boolean palin(String name){
            int n = name.length();
            for(int i =0; i<n/2; i++){
                if(name.charAt(i) == name.charAt(n-1-i)){
                    return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // revers a string
        System.out.println("Enter the string");
        String name = sc.nextLine();
        String re = "";
        char ch;

        for(int i=0; i<name.length(); i++){
            ch=name.charAt(i);
            re=ch+re;
        }
        System.out.println("reverse string is " + re);

        boolean pal = palin(name);
        if(pal){
            System.out.println("yes it is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        if(re.equals(name)){
            System.out.println("yes Its PalinDrome");
        }
        else{
            System.out.println("No Its PalinDrome");
        }

        System.out.println(re.equals(name));

        System.out.println(re.compareTo(name));

    }
    }


