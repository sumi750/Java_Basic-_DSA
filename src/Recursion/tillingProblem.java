package Recursion;
import java.util.*;
public class tillingProblem {
    public static int tiling(int n){
        if(n==0 || n==1) return 1;
        int vertical = tiling(n-1);
        int horizontal = tiling(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        //Floor is 2XN, Tiles are 2X1, how many ways we can fill the tiles into floor
        //You can put a tile in vertical manner or horizontal manner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }
}
