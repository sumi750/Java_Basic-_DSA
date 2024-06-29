package Bit_ManiPulation;
import java.util.*;
public class basic2 {
    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // even number
            System.out.println("Number is Even");
        }
        else{
            //odd number
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Left Shift " + (1<<2));
        System.out.println("Right Shift " + (6>>2));
        // Check Odd or Even
        int n = sc.nextInt();
        OddOrEven(n);
    }
}
