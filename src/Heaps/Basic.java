package Heaps;

import java.util.PriorityQueue;

class Students implements Comparable<Students> {
    String name;
    int rank;

    public Students(String name, int rank){
        this.name = name;
        this.rank = rank;
    }
 
    @Override
    public int compareTo(Students s2){
        return this.rank - s2.rank;
    }
}

public class Basic {
    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();
        pq.add(new Students("Sumit", 2));
        pq.add(new Students("Ankit", 8));
        pq.add(new Students("Amit", 4));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
