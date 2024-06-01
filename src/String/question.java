package String;
import java.util.*;
public class question {

    public static void find(String enter){
//        System.out.println("The vowels are");
        int countv = 0;
        int countc = 0;
        for(int i=0; i<enter.length(); i++){
            if(enter.charAt(i) == 'a' || enter.charAt(i) == 'e' || enter.charAt(i) == 'i' || enter.charAt(i) == 'o'
            || enter.charAt(i) == 'u'){
//                System.out.print(enter.charAt(i) + " " );
                countv++;
            }
            else if (enter.charAt(i)>'a' && enter.charAt(i)<='z') {
//                System.out.print(enter.charAt(i) + " ");
                countc++;
            }
        }
        System.out.println();
        System.out.println("The count of vowels are " + countv);
        System.out.println("The count of consonats are " + countc);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        String enter = sc.nextLine();
        find(enter);
    }
}
