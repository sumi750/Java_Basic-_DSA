package Greedy_Algo;
import java.util.*;
import java.sql.Array;
import java.util.Arrays;

public class Activity_Selection {

    /* Related questions
    How many meeting in one room --> N meeting in one room
    Maximum Meeting in one room
    Maximum length of chain pairs
    */


    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        int n = start.length;
        int[][] act = new int[n][3];

        for(int i=0; i<n; i++){
            act[i][0] = i+1;   //index
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        //sorting the 2D Array Object on the basis of end
        Arrays.sort(act, Comparator.comparingDouble(a-> a[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int lastEnd = act[0][2];
        ans.add(act[0][0]);  // Always add first activity

        for(int i=1; i<end.length; i++){
            if(act[i][1] >= lastEnd){
                ans.add(act[i][0]);
                lastEnd = act[i][2];
            }
        }

        System.out.println("Max Activity " + ans.size());
        System.out.println(ans);

    }
}
