package queue;
import java.util.*;
public class ReverseFirstK {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qe = new ArrayDeque<>();
        int k = 3;
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        int n = qe.size();
        System.out.println("Before Reversing the Queue " + qe);

        for(int i = 1; i<=k; i++){
            st.push(qe.remove());
        }

        while(st.size()>0){
            qe.add(st.pop());
        }

        for(int i = 1; i<=n-k; i++){
            int a = qe.remove();
            qe.add(a);
        }

        System.out.println("After K reversing the Queue " + qe);


    }
}
