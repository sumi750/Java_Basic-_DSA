package queue;
import java.util.*;
public class Basic_STL {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        // System.out.println(qe);   // USing Extra Array in backend to print
        Queue<Integer> helper = new ArrayDeque<>();

        while(qe.size() > 0){
            System.out.print(qe.peek()+ " ");
            helper.add(qe.poll());
        }

        System.out.println();
        System.out.println("helper Queue "+ helper);
        // Again refill the original queue
        while(helper.size()>0){
            qe.add(helper.remove());
        }

        System.out.println();
        System.out.println("Original Queue " + qe);

    }
}
