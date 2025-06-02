package Greedy_Algo;
import javax.crypto.spec.PSource;
import java.util.*;

public class Max_Chain_Length {
    public static void main(String[] args) {
        int[][] pairs = {
                {5,24},
                {39,60},
                {5,28},
                {27,40},
                {50,90}
        };

        Arrays.sort(pairs, Comparator.comparingInt(a->a[1]));
        int ans = 1;
        int chainEnd = pairs[0][1];
        for(int i=1; i< pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                ans++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max Length Of Chain is " + ans);
    }

}
