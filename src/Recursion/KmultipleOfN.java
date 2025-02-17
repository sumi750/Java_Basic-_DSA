package Recursion;
import java.util.*;
public class KmultipleOfN {
    public static void Kmultiples(int n, int k){
        if(k == 0 )  return;  // Base Case
        Kmultiples(n,k-1);   // small problem
        System.out.print(n*k+" ");   // self work

    }

    public static int ASum(int a){
        if(a == 0) return 0;

        if(a%2 != 0){
            return ASum(a-1) + a;
        }
        else{
            return ASum(a-1) - a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Printing First K Multiple of N");
        System.out.print("Enter the Value of N ");
        int n = sc.nextInt();
        System.out.print("Enter the value of K ");
        int k = sc.nextInt();
        Kmultiples(n,k);
        System.out.println();
        //Alternate Sum Series
        System.out.println("Alternate Sum Series ");
        int a = sc.nextInt();
        System.out.println(ASum(a));

    }
}
