package Bit_ManiPulation;
import java.util.*;
public class fastExpo {
    public static void swap(int a, int b){
        int x = a;
        int y = b;

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("Swap value of a "+ x);
        System.out.println("Swap value of b " + y);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            swap(a,b);
    }
}
