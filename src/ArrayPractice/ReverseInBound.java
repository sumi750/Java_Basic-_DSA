package ArrayPractice;
import java.util.*;
public class ReverseInBound {
    public static int reverse(int n){
        int re=0;
        int digit;
        while(n!=0){
            digit = n % 10;
            re = (re*10) + digit;
            if(re > Integer.MAX_VALUE/10 || re < Integer.MIN_VALUE/10) return 0;
            n = n/10;
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = reverse(n);
        System.out.println(m);
    }
}
