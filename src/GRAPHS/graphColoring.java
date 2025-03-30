package GRAPHS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class graphColoring {
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
//        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

//        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,1));

//        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
    }

    //Bipartite Graph or Not
    public static boolean isBipartite(int V,ArrayList<Edge>[] graph){
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i=0; i<V; i++){
            if(color[i] == -1){
                if(!check(i, graph, color)){
                    return false;
                }
            }
        }
        return true;
    }

    //utility Function for bipartite check
    public static boolean check(int start, ArrayList<Edge>[] graph, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int j=0; j<graph[curr].size(); j++){
                Edge e = graph[curr].get(j); //e.des
                if(color[e.des] == -1){
                    int nextCol = color[curr] == 0 ? 1 : 0;
                    color[e.des] = nextCol;
                    q.add(e.des);
                }
                else if (color[e.des] == color[curr]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createG(graph);
        System.out.println(isBipartite(V, graph));
    }
}
