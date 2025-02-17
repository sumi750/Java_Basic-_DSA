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

    //p power q --> O(n)
    public static int PpowerQ(int p, int q){
        if(q==0) return 1;
        return PpowerQ(p,q-1)*p;
    }


    //p power q --> O(logn)
    public static int PpowerQQ(int p,int q){
        if(q==0) return 1;
        int power = PpowerQ(p,q/2);
        if(q%2==0){
            return power*power;
        }
        else{
            return power*power*p;
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
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(PpowerQ(p,q));
        System.out.println(PpowerQQ(p,q));

    }
}
