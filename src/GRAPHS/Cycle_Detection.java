package GRAPHS;

import java.util.ArrayList;

public class Cycle_Detection {

    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    static void createG(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,0));

        graph[4].add(new Edge(4,3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        for(int i=0; i< graph.length; i++){
            if(!visit[i]){
                if(detectCycleUtil(graph, visit, i, -1)){
                    return true;   //cycle exist in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //Case 3
            if(!vis[e.des] && detectCycleUtil(graph, vis, e.des, curr)){
                return true;
            }

            //case 1
            else if(vis[e.des] && e.des != parent){
                return true;
            }

            //case 2 --> do nothing and continue
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createG(graph);

        if(detectCycle(graph)){
            System.out.println("Yes cycle is exist in the graph");
        }
        else{
            System.out.println("No cycle is exist ");
        }
    }
}
