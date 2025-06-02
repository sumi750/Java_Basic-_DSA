package Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;
        int n = val.length;

        double[][] ratio = new double[n][2];
        //0th col  -> index , 1st col -> ratio
        for(int i=0; i<n; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(a-> a[1]));
        int capacity = W;
        double FinalVal = 0.0;

        for(int i= ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                FinalVal += val[idx];
                capacity -= weight[idx];
            }
            else{
                FinalVal += (ratio[i][1] * capacity);
                break;
            }
        }

        System.out.println("Final Value " + FinalVal);
    }
}
