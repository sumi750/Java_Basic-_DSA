package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] arr = {-8,2,5,-1,7,2,4,-3};
        int k = 2;
        System.out.println(negative(arr, k));
    }

    public static ArrayList<Integer> negative(int[] arr, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        Deque<Integer> dq = new LinkedList<>();

        for(int end = 0; end< arr.length; end++) {
            if (arr[end] < 0) dq.addLast(end);    //index of negative number


            if (end - start + 1 == k) {
                if (!dq.isEmpty()) {
                    ans.add(arr[dq.peekFirst()]);
                } else ans.add(0);

                if(!dq.isEmpty() && dq.peekFirst() == start){
                    dq.pollFirst();
                }
                start++;
            }
        }

        return ans;
    }
}
