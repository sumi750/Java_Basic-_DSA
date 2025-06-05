package Greedy_Algo;
import java.lang.reflect.Array;
import java.util.*;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18},
                {9,16}
        };

        int[][] newArray = mergeInterval(intervals);

        for (int[] interval : newArray) {
            System.out.println(Arrays.toString(interval));
        }

    }

    public static int[][] mergeInterval(int[][] intervals){
        if(intervals.length<=1) return intervals;

        Arrays.sort(intervals, (a,b)-> a[0]-b[0]); //sort based on start time

        ArrayList<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for(int[] interval : intervals){
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextStart){
                //overlap the interval --> merge it
                current[1] = Math.max(currentEnd, nextEnd);
            }
            else{
                current = interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

}
