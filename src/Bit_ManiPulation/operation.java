package Bit_ManiPulation;
import java.util.*;
public class operation {
    //get Ith bit
    public static int getItbit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else
        {
            return 1;
        }
    }

    //set Ith bit
    public static int setIth(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    //Clear Ith bit
    public static int clearBit(int n , int i){
        int bitmask = ~(1<<i);
        return  n & bitmask;
    }

    //Power of Two or not
    public static boolean isPower(int n){
        return (n & (n-1)) == 0;
    }

    //Count set Bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while(n>0) {
            if( (n & 1) != 0){  // check out LST
                count++;
            }
           n =  n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getItbit(15,3));
        System.out.println(setIth(10, 2));
        System.out.println(clearBit(10, 1));
        System.out.println(isPower(15));
        System.out.println(countSetBits(15));
    }
}
