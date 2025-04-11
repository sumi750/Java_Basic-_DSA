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

    //TopLogical Sort using DFS on DAG
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

    public static void calInDeg(ArrayList<Edge>[] graph, int[] inDeg){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                inDeg[e.des]++;
            }
        }
    }

    //TopLogical Sort Using BFS on DAG
    public static ArrayList<Integer> topSortBFS(int V, ArrayList<Edge>[] graph){
        int[] inDeg = new int[V];
        calInDeg(graph, inDeg);

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<V; i++){
            if(inDeg[i] == 0) q.add(i);
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            list.add(curr);

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDeg[e.des]--;
                if(inDeg[e.des] == 0){
                    q.add(e.des);
                }
            }
        }

        if (list.size() != V) {
            throw new RuntimeException("Graph is not a DAG (contains a cycle)");
        }

        return list;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        crateGraph(graph);

        System.out.println("TopLogical Sort "+  topSort(V, graph));
        System.out.println("TopLogical Sort using BFS" + topSortBFS(V, graph));
    }
}
