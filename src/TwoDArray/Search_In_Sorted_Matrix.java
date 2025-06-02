package TwoDArray;
import java.util.*;
import java.util.Scanner;

public class Search_In_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Enter the target ");
        int target = sc.nextInt();

        boolean isFind = search(mat, target);
        if(isFind) System.out.println("Yes ");
        else System.out.println("No");
    }

    public static boolean search(int[][] mat, int target){
        int n = mat.length;
        int m = mat[0].length;
        int row = 0;
        int col  = m-1;

        while(row < n && col>=0){
            if(target > mat[row][col]) row++;
            else if(target < mat[row][col]) col--;
            else return true;
        }
        return false;
    }
}
