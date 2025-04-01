package GRAPHS;
import java.util.*;

public class cycle_detection_Directed {
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(int V, ArrayList<Edge>[] graph){
        for(int i =0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));

    }

    public static boolean isCycle(int V, ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[V];
        boolean[] stack = new boolean[V];

        // for connected components
        for(int i =0; i<V; i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,stack,vis)) return true;
            }
        }
        return false;
    }

    //Util Function
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.des]) return true;
            if(!vis[e.des] && isCycleUtil(graph, e.des, vis, stack)) return true;
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V,graph);

        System.out.println(isCycle(V, graph));
    }
}
