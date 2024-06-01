package Recursion;
import java.util.*;
public class sumOfDigit {

    // Sum of the Digit
    public static int dgtSum(int n){
        if(n==0){
            return 0;
        }
        int lastDigit = n%10;
        int rem = dgtSum(n/10);
        return lastDigit + rem;
    }

    // Reverse of the digit
    public static void reverseDigit(int n){

        if( n < 10){
            System.out.println(n);
            return;
        }

        else{
            System.out.print(n%10);
            reverseDigit(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of ");
        int n = sc.nextInt();
        int result = dgtSum(n);

        System.out.println("Sum of the digits is " + result);
        System.out.print("Reverse Number is " + " ");
        reverseDigit(n);
//        System.out.println(reverse);

    }
}
