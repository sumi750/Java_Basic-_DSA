/*
DeQue Operations
addFirst()
addLast()
removeFirst()
removeLast()
getFirst()  --> Peek()
getLast()
*/
package queue;
import java.util.*;
public class DeQue {
    public static void main(String[] args) {
        Deque<Integer> de = new LinkedList<>();
        de.addFirst(1);
        de.addFirst(2);
        de.addLast(8);
        System.out.println(de);
        de.removeLast();
        System.out.println(de);
    }
}
