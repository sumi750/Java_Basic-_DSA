package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class stockSpanProblem {
    public static ArrayList<Integer> stockSpan(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        list.add(1);

        for(int i=1; i<n; i++){
            int currentPrice = arr[i];
            while(!st.isEmpty() && arr[st.peek()] <= currentPrice ) st.pop();
            if(!st.empty()) list.add(i-st.peek());
            else list.add(i+1);
            st.push(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80,60,70,60,85,100};
        System.out.println(stockSpan(arr));
    }
}
