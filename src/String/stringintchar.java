package String;
import java.util.*;
public class stringintchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str +=10;
        System.out.println(str);
        System.out.println("abc"+10+20);

        String str1 = "abcd"; // 0 to 3
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(str1.substring(i,j) + " ");
            }
            System.out.println();

            // Interning and new property
            // why interning : to save the memory
            // what: - What is the concept of interning in Java?
            //The method intern() creates an exact copy of a String
            // object in the heap memory and stores it in the String constant
            // pool

            
        }
    }
}
