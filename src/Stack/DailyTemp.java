package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = dailyTemp(temp);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] dailyTemp(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i= arr.length-1; i>=0; i--){

            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                st.pop();
            }

            if(!st.isEmpty()){
                result[i] = st.peek() - i;
            }
            else{
                result[i] = 0;
            }

            st.push(i);
        }
        return result;
    }
}
