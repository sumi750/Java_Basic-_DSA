package BackTracking;
import java.util.*;

public class Maze {

    static int count = 0;
    public static void main(String[] args) {
        System.out.println("Count of number of ways from (0,0) to (3,3) ");
        System.out.println(mazeWays(3,3));
        printPath("", 3,3);
        System.out.println("No. of ways" + count);
        System.out.println(printPath2("", 3,3));
        System.out.println(printPath3("", 3,3));
    }

    //return no. of ways
    public static int mazeWays(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = mazeWays(row-1, col);
        int right = mazeWays(row, col-1);

        return left+right;
    }

    //Print the path
    public static void printPath(String p, int row, int col){

        //Base Case
        if(row == 1 && col == 1){
            count++;
            System.out.println(p);
            return;
        }

        //Recursion
        if(row > 1){
            printPath(p+'D', row-1, col);
        }

        if(col > 1){
            printPath(p+'R', row, col-1);
        }

    }


    //Returning the paths into ArrayList
    public static ArrayList<String> printPath2(String p, int row, int col){

        //Base Case
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        //Recursion
        if(row > 1){
            ans.addAll(printPath2(p+'D', row-1, col));
        }

        if(col > 1){
            ans.addAll(printPath2(p+'R', row, col-1));
        }

        return ans;
    }

    //Including the Diagonal Path also
    public static ArrayList<String> printPath3(String p, int row, int col){

        //Base Case
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        //Recursion
        if(row > 1 && col > 1){
            ans.addAll(printPath3(p+'X', row-1, col-1));
        }

        if(row > 1){
            ans.addAll(printPath3(p+'D', row-1, col));
        }

        if(col > 1){
            ans.addAll(printPath3(p+'R', row, col-1));
        }

        return ans;
    }

}
