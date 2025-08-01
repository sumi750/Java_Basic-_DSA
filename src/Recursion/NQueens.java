package Recursion;
import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of solutions  "+solveQ(n));

    }

    public static int solveQ(int n){
        boolean[][] board = new boolean[n][n];
        return countSol(board, 0);
    }

    public static int countSol(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;

        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += countSol(board, row+1);   //recursion
                board[row][col] = false;    //backtrack
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col]) return false;
        }

        //for left

        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]) return false;
        }

        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]) return false;
        }

        return true;
    }


    public static void display(boolean[][] board){
        for(boolean[]  row : board){
            for(boolean element : row) {
                if (element) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
