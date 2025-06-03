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
        int[][] jobInfo = {{4,20},{1,20}, {1,40}, {1,30}};

        ArrayList<Job> job = new ArrayList<>();

        for(int i=0; i< jobInfo.length; i++){
            job.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
        }

        Collections.sort(job, (a,b)-> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<job.size(); i++){
            Job curr = job.get(i);
            if(curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Total Job we can perform " + seq.size());
        System.out.println(seq);

    }
}
