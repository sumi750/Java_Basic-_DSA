package BackTracking;
import java.util.*;

public class Sudoku_Solver2 {

    public static boolean solveSudoku(char[][] board){
        return helper(0,0,board);

    }

    private static void display(char[][] board){
        for(char[] row : board){
            for(char num : row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    public static boolean helper(int row, int col, char[][] board){
        if(row == 9) return true;
        int nextRow = row;
        int nextCol = col+1;

        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col] != '.'){
            return helper(nextRow, nextCol, board);
        }

        //place the correct digit
        for(char digit = '1'; digit <= '9'; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(helper(nextRow, nextCol, board)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit){

        //horizontal
        for(int j=0; j<9; j++){
             if(board[row][j] == digit) return false;
        }

        //vertical
        for(int i=0; i<9; i++){
            if(board[i][col] == digit) return false;
        }

        //grid
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;

        for(int r = sRow; r<=sRow+2; r++){
            for(int c = sCol; c<=sCol+2; c++){
                if(board[r][c] == digit) return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if(solveSudoku(board)){
            display(board);
        }
        else{
            System.out.println("can't find answer ");
        }
    }
}
