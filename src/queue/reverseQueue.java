package queue;
import java.util.*;
public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        qe.add(6);
        qe.add(7);

        System.out.println("Original Queue is " + qe);
        Stack<Integer> st = new Stack<>();
        while(qe.size() > 0){
            st.push(qe.remove());
        }

        while(st.size() > 0){
            qe.add(st.pop());
        }
        System.out.println("Reverse Queue is " + qe);
    }
}
