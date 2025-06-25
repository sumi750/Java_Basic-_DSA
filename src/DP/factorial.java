package DP;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        System.out.println("Fib number of "+n+ " is " + fib_dp(n,dp));
    }

    public static int fib_dp(int n, int[] dp){
        if(n==0 || n==1) return n;

        if(dp[n] != 0) return dp[n];
        dp[n] = fib_dp(n-1, dp) + fib_dp(n-2, dp);
        return dp[n];
    }
}
