package queue;
import java.util.*;
public class FirstNegative {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        long[] arr = {12,-1,-7,8,-15,30,16,28};
        int n = arr.length;
        int k = 3;
        long[] result = new long[n-k+1];

        for(int i = 0; i<n; i++){
            if(arr[i] < 0){
                q.add(i);   // adding -ve indices into the queue
            }
        }

        // result array
        for(int i = 0; i<n-k+1; i++){
             if(q.size() > 0 && q.peek() < i) q.remove();

             if(q.size() > 0 && q.peek() <= i+k-1){
                 result[i] = arr[q.peek()];
             }
             else if (q.size() == 0) result[i] = 0;
             else result[i] = 0;
        }

        for (int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
