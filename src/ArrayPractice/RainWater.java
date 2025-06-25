package ArrayPractice;
import java.util.*;
public class RainWater {
    public static int water(int[] height, int width){
        int w = width;
        int n = height.length;
        int trappedWater = 0;
        // calculate left max boundary - array
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary - array
        int[] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //Loop
        for(int i=0; i<n; i++){
            //  WaterLevel = min(leftMax, rightMax)
                int waterLevel = Math.min(leftMax[i], rightMax[i]);
                trappedWater = trappedWater + (waterLevel - height[i])*w;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        int width = 1;
        int trap = water(arr,width);
        System.out.println("Trapped water is = " + trap);
    }
}
