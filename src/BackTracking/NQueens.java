package BackTracking;
import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        System.out.println("No. of ways to " + queens(board, 0));
    }

    //No. of ways to place NxN queens in a chess
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;
        // placing the queens and checking for every row and column
        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count+= queens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }


    //check for isSafe
    private static boolean isSafe(boolean[][] board, int row, int col){
         // check vertical
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        //diagonal left
        int maxLeft = Math.min(row,col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //diagonal Right
        int maxRight = Math.min(row, board.length - col -1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }


    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
