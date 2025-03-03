package Binary_Search_Q;
import java.util.*;

public class Eating_Banana {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int hour = 8;
        int max = Arrays.stream(arr).max().getAsInt(); //Max Element in Array

        for(int i=1; i<=max; i++){
            int req_time = fun(arr, i);
            if(req_time <= hour){
                System.out.println(i);
                break;
            }
        }

        System.out.println(koko(arr, hour));

    }
    public static int fun(int[] arr, int hour){
        int total=0;

        for(int i=0; i<arr.length; i++){
            total += Math.ceil((double)arr[i]/(double)hour);
        }

        return total;
    }

    //Optimal approach using binary search
    public static int koko(int[] arr, int hour){
        int low = 0;
        int high = Arrays.stream(arr).max().getAsInt();

        while(low <= high){
            int mid = (low+high)/2;
            int total = func(arr, mid);

            if(total <= hour){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    private static int func(int[] arr, int hour){
        int t = 0;

        for(int i=0; i<arr.length; i++){
            t += Math.ceil((double)arr[i]/(double)hour);
        }

        return t;
    }
}
