package BackTracking;
import java.util.*;

public class Nqueens2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            List<List<String>> solutions = solveNQueens(n);
            System.out.println("Total Solutions: " + solutions.size());
            System.out.println(solutions);
        }

        public static List<List<String>> solveNQueens(int n) {
            List<List<String>> result = new ArrayList<>();
            boolean[][] board = new boolean[n][n];
            solve(board, 0, result);
            return result;
        }

        private static void solve(boolean[][] board, int row, List<List<String>> result) {
            if (row == board.length) {
                result.add(constructBoard(board));
                return;
            }

            for (int col = 0; col < board.length; col++) {
                if (isSafe(board, row, col)) {
                    board[row][col] = true;
                    solve(board, row + 1, result);
                    board[row][col] = false;
                }
            }
        }

        private static boolean isSafe(boolean[][] board, int row, int col) {
            for (int i = 0; i < row; i++) {
                if (board[i][col]) {
                    return false;
                }
            }

            int maxLeft = Math.min(row,col);
            for(int i=1; i<=maxLeft; i++){
                if(board[row-i][col-i]){
                    return false;
                }
            }

            int maxRight = Math.min(row, board.length-col-1);
            for(int i=1; i<=maxRight; i++){
                if(board[row-i][col+i]){
                    return false;
                }
            }

            return true;
        }

        private static List<String> constructBoard(boolean[][] board) {
            List<String> res = new ArrayList<>();
            for (boolean[] row : board) {
                StringBuilder sb = new StringBuilder();
                for(boolean element : row){
                    sb.append(element ? 'Q' : '_');
                }
                res.add(sb.toString());
            }
            return res;
        }
    }
