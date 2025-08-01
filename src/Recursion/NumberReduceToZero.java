package Recursion;
import java.util.*;

public class NumberReduceToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("Number of steps to make zero  " + reduce(n));
    }

    public static int reduce(int n){
        return helper(n,0);
    }

    public static int helper(int n, int count){
        if(n==0) return count;
        if(n % 2 == 0) return helper(n/2, count+1);

        return helper(n-1, count+1);
    }

}
