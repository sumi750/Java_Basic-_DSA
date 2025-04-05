package GRAPHS;
import java.util.*;

class pair{
    int first;
    int second;
    public pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}


public class NoOfIslands {

    private static void bfs(int ro, int co, int[][] vis, char[][] grid){
        vis[ro][co] = 1;
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(ro, co));

        int n = grid.length;
        int m = grid[0].length;

        //4-directional movement : up,right,down,left

        int[] dRow = {-1,0,1,0};
        int[] dCol = {0,1,0,-1};

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;

            q.remove();

            for(int i=0; i<4; i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == '1'
                && vis[nRow][nCol] == 0){
                    vis[nRow][nCol] = 1;
                    q.add(new pair(nRow,nCol));
                }
            }
        }

    }

    public static int noIsland(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        int[][] vis = new int[n][m];   //visit 2D array for mark

        for(int row =0; row<n; row++){
            for(int col=0; col<m; col++){
                if(vis[row][col] == 0 && grid[row][col] == '1'){
                    count++;
                    bfs(row,col, vis, grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(noIsland(grid));
    }
}
