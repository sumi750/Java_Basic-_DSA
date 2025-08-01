package Recursion;
import java.util.*;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("Count of Zeros in given N is " + count(n));
    }

    public static int count(int n){
        return helper(n,0);
    }

    public static int helper(int n, int cnt){
        if(n == 0) return cnt;
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, cnt+1);
        }
        else{
            return helper(n/10, cnt);
        }
    }

}
