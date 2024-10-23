package Recursion;

public class NoofDigit {
    public static int countD(int n) {
        int cnt = 0;
        while(n!=0){
            n = n/10;
            cnt++;
        }
        return cnt;
    }

    public static int sumD(int n){
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            sum = sum + ld;
            n/=10;
        }
        return sum;
    }

    public static int reverse(int n){
        int reverse = 0;
        while(n!=0){
            int ld = n%10;
            reverse = reverse*10 + ld;
            n/=10;
        }
        return reverse;
    }


    public static void main(String[] args) {
        int n = 12564;
        System.out.println("Count of digit " + countD(n));
        System.out.println("Sum of Digit "+ sumD(n));
        System.out.println("Reverse of Number " + reverse(n));
    }
}
