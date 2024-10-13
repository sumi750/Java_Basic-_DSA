package Stack;

import java.util.Stack;

public class nextGreaterElement {
    public static int[] gElement(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;         // Resultants last element will always -1
        st.push(arr[n-1]);    // Push the last element of Array into the stack


        for(int i = n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size() == 0 )  {
                res[i] = -1;
            }
            else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = gElement(arr);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
