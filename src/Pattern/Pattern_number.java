package Pattern;
import java.util.*;
public class Pattern_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        int n =5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Floyd's Triangle");
        /*
        1
        2 3
        4 5 6
        7 8 9 10
1       11 12 13 14 15
        */
        int l = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }

    }
}
