package Bit_ManiPulation;

import java.util.*;

//import java.util.*;
public class basicBit {
    public static int decTobin(int n){
        int poww = 0;
        int dec = 0;
        int bin = n;
        while(bin>0){
            int ld = bin%10;
            dec = dec + (ld*(int)Math.pow(2,poww));
            poww++;
            bin/=10;
        }

        return dec;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Binary to Decimal");
        int bin = sc.nextInt();
        int dec = decTobin(bin);
        System.out.println("Decimal number is "+ dec);

    }
}
