package String;
import java.util.*;
public class basicString {

    public static void printL(String str){

        for(int i=0; i<str.length(); i++){
            System.out.println(" At index " + i + " the charcter is " + str.charAt(i) );
        }
    }

    public static void main(String[] args) {
        // String Topic
        Scanner sc = new Scanner(System.in);
        char arr[] = {'a','b','c'};
        String str = "Sumit";    // direct method
        String str2 = new String("hello World");  // using new keyWord

        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);

        // String are immutable
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("The length of string is " + name.length() + " And my " +  str + " is Panjab Univeristy");
        System.out.println(name.charAt(0));  // charAt Method
        printL(str);
    }
}
