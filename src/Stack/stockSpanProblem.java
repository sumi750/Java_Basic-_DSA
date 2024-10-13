package Stack;

import java.util.Stack;

public class stockSpanProblem {
    public static int[] stockSpan(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        st.push(0);   // push the zeroth index
        res[0] = 1;

        for(int i=1; i<n; i++){
            int currPrice = arr[i];
            while(!st.isEmpty() && arr[st.peek()] < currPrice){
                st.pop();
            }

            if(st.size() > 0){
                res[i] = i-st.peek();
            }
            else{
                res[i] = i+1;
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80,60,70,60,85,100};
        int[] res = stockSpan(arr);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
