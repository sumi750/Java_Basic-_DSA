package Recursion;


import java.util.*;
public class RecursionBasic {

    public static void printNumber(int n){

        if(n == 0){
            System.out.print(n + " ");
            return;
        }

        printNumber(n-1);   // making the call stack
        System.out.print(n + " ");

    }

    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }



     public static int facto(int n){
        if(n == 1 || n ==0){
            return 1;
        }


        return n*facto(n-1);
    }

    public static int nSum(int n){
        if(n==1){
            return 1;
        }
        return n + nSum(n-1);  //Self Work
    }

    public static void main(String[] args) {
        // Print 1 To n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Printing 0 to N");
        printNumber(n);   // Acc order  0 -> n
        System.out.println();

        System.out.println("Printing N to 0");
        printDec(n);     // Dec order   n -> 0
        System.out.println();

        int ans = facto(n);     // fact calling   n!
        System.out.println("The factorial of " + n +  "=" + ans);

        System.out.println("sum of N natural number "+ nSum(n) );
    }
}
