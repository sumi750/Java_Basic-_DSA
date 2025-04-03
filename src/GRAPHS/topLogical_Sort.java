package GRAPHS;
import java.util.*;
import java.util.ArrayList;

public class topLogical_Sort {
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void crateGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
       }

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
    }

    public static ArrayList<Integer> topSort(int V, ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[V];
        Stack<Integer> s = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<V; i++){
            if(!vis[i]){
                topSortUtil(i, s, graph, vis);
            }
        }

        while (!s.isEmpty()){
            ans.add(s.pop());
        }
        return ans;
    }

    public static void topSortUtil(int curr, Stack<Integer> s, ArrayList<Edge>[] graph, boolean[] vis){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.des]){
                topSortUtil(e.des, s, graph, vis);
            }
        }

        s.push(curr);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        crateGraph(graph);

        System.out.println("Topological Sort "+  topSort(V, graph));
    }
}
