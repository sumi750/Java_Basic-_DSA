package Recursion;

import java.util.Scanner;

public class Fibnochii {

    // Nth Fib Number
    public static int fab(int n) {

        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        // sub parts
        int prev = fab(n - 1);
        int prevPrev = fab(n - 2);

        // self work
        return prevPrev + prev;
    }

    // Sum of Digit
    public static int sod(int n ){
        if(n>=1 && n<=9) return n;
        return sod(n/10) + n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Nth fib Number " + fab(n));
        System.out.println("Fib series till N");
        for (int i = 0; i <= n; i++) {
            System.out.print(fab(i)+" ");
            sum = sum + fab(i);
        }
        System.out.println();
//
        System.out.println("Sum until nth fib "+ sum);
        int num = sc.nextInt();
        System.out.println(sod(num));
    }
}
