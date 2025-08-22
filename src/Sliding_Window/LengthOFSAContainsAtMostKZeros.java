package Sliding_Window;
import java.util.*;

public class LengthOFSAContainsAtMostKZeros {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println("Length " + longestOnes(arr, k));
    }

    public static int longestOnes(int[] arr, int k){
        int maxLen = 0, start =0, zeroCount = 0;
        for(int end = 0; end<arr.length; end++){
            if(arr[end] == 0) zeroCount++;

            if(zeroCount > k){
                if(arr[start] == 0) zeroCount--;
                start++;
            }

            if(zeroCount <= k) maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}
