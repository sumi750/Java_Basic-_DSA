package Greedy_Algo;
import java.util.*;

public class Job_Sequence_Problem {

    static class Job{
        int deadLine;
        int profit;
        int id;

        Job(int id, int p, int d){
            this.id = id;
            this.deadLine = d;
            this.profit = p;
        }
    }

    public static void main(String[] args) {
//        int[][] jobInfo = {{4,20},{1,20}, {1,40}, {1,30}};
        int[] d = {4,1,1,1};
        int[] p = {20,20,40,30};

        ArrayList<Job> job = new ArrayList<>();

        for(int i=0; i< d.length; i++){
            job.add(new Job(i, p[i], d[i]));
        }

        Collections.sort(job, (a,b)-> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int maxProfit = 0;
        for(int i=0; i<job.size(); i++){
            Job curr = job.get(i);
            if(curr.deadLine > time){
                maxProfit += curr.profit;
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Total Job we can perform " + seq.size());
        System.out.println("Total profit we gain " + maxProfit);
        System.out.println(seq);

    }
}
