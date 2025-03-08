package BackTracking;
import java.util.*;

public class Maze2 {
    public static void main(String[] args) {
        boolean[][] board =  {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        path("", board, 0,0);
    }

    //Maze with Obstacles
    //When you land on the new cell check false or true
    public static void path(String p, boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length-1){
            path(p+'D', maze, row+1, col);
        }

        if(col < maze[0].length - 1){
            path(p+'R', maze, row, col+1);
        }

    }
}
