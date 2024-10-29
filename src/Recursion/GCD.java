package Recursion;
import java.util.*;
public class GCD {
    public static int gcd(int x,int y){
        int rem=0;
        while(x%y!=0){
            rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static int Gcd(int x, int y){
        if(y==0) return x;
        return Gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
        System.out.println(Gcd(x,y));
    }
}
