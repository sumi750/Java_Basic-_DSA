package String;
import java.awt.*;
import java.util.*;
public class subString {

    public static String substring(String name, int si, int ei){
            String substr = "";
            for(int i=si; i<ei; i++){
                substr += name.charAt(i);
            }
            return substr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SubString
        String name = "Aumit";
        String lastname = "Kumar";
        System.out.println(name.concat(lastname));
//        System.out.println(name);
        // Syntax: - stringName.substring(si,ei);
        String str = name.substring(0).toUpperCase();  // capital the whole string
        System.out.println(str);
        String str1 = name.substring(0).toLowerCase(); // lower the whole string
        System.out.println(str1);

//        System.out.println(substring(name,0,5));
        // inBuilt Method: - StringName.substring(0,5);
        System.out.println(name.substring(0,5));

        System.out.println(name.compareToIgnoreCase(lastname));

        String fruits[] = {"Apple", "Mango", "Banana"};
        //comparing the strings
        String lasrgest = fruits[0];
        for (int i=0; i<fruits.length; i++){
            if(lasrgest.compareTo(fruits[i])<0)  // lexicographical order
            {
                lasrgest = fruits[i];
            }
        }
        System.out.println(lasrgest);
    }
}
