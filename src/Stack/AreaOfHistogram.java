package Stack;
import java.util.*;

public class AreaOfHistogram {
    public static void main(String[] args) {
        int[] arr  = {2,1,5,6,2,3};
        System.out.println(area(arr));
    }

    public static int area(int[] arr){
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int[] nse = new int[arr.length];
        int[] pse = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }

            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }

        while (st.isEmpty()) st.pop();

        for(int i=0; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) st.pop();
            pse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }

        for (int i=0; i< arr.length; i++){
            int area = arr[i]*(nse[i] - pse[i] -1);
            max = Math.max(max, area);
        }


        return max;
    }
}
