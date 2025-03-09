package BackTracking;

import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] board =  {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length];

        allPath("", board, 0, 0, path, 1);
    }

    public static void allPath(String p, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        //I am considering this change
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length-1){
            allPath(p+'D', maze, row+1, col, path, step+1);
        }

        if(col < maze[0].length - 1){
            allPath(p+'R', maze, row, col+1,path, step+1);
        }

        if(row > 0){
            allPath(p+'U', maze, row-1, col, path, step+1);
        }

        if(col > 0){
            allPath(p+'L', maze, row, col-1, path, step+1);
        }

        //backtrack --> remove the changes
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
