package Sorting;

import java.util.*;
public class eg {

    //Nth Fib number
    public static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }

        if(n<0){
            return n;
        }

        int prev = fib(n-1);
        int pPrev = fib(n-2);
        return prev + pPrev;

    }

    //Sum of Digits
    public static int sod(int n){
        if(n == 0) return n;  //base case
        int lastDigit = n%10;
        int rem = sod(n/10);  //recursive function
        return lastDigit + rem;  //work
    }

    //Product of Digits
    public static int prd(int n){
        if(n%10 == n) return n;
        return (n%10) * prd(n/10);
    }

    //Reverse a Digit
    public static void reverse(int n){
        if(n<10) {
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            reverse(n/10);
        }
    }

    //count zeros
    public static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int c){
        if(n == 0) return c;

        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(fib(n) < 0){
           System.out.println("Number is invalid");
        }
        else{
           System.out.println(n+"th fibonacci number is "+ fib(n));
        }

        System.out.println("Enter the digit ");
        int digit = sc.nextInt();
        System.out.println("Sum of the digit is "+ sod(digit));
        System.out.println("Product of digits is"+ prd(digit));
        System.out.print("Reverse of digit is ");
        reverse(digit);

        int d = sc.nextInt();
        System.out.println("Number of zeros are "+ count(d));
    }
}
