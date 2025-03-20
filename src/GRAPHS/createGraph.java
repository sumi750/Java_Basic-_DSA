package GRAPHS;
import java.util.*;

public class createGraph {

    static class Edge{
        int des,  wt;
        public Edge(int des, int wt){
            this.des = des;
            this.wt = wt;
        }
    }

    private int vertices;
    private ArrayList<ArrayList<Edge>> adjList;

    //Create Graph
    public createGraph(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);

        for(int i=0; i<vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }


    //Adding Edge in Graph
    public void addEdge(int src, int des, int wt){
        adjList.get(src).add(new Edge(des, wt));
        adjList.get(des).add(new Edge(src,wt));
    }

    //BFS --> uses Queue for traversal
    public  void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        q.add(start);
        visited[start] = true;

        System.out.print("BFS Traversal ");
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+ " ");

            for(Edge edge : adjList.get(node)){
                if(!visited[edge.des]){
                    visited[edge.des] = true;
                    q.add(edge.des);
                }
            }
        }
        System.out.println();
    }

    //DFS using recursion--> use a Stack or call Stack for traversing

    public void dfs(int start){
        boolean[] visited = new boolean[vertices];  //Array size == vertices
        System.out.print("DFS Traversal  ");
        dfsHelper(start, visited);
        System.out.println();
    }

    public void dfsHelper(int node, boolean[] visit){
        visit[node] = true;
        System.out.print(node+ " ");
        for(Edge edge: adjList.get(node)){
            if(!visit[edge.des]){
                dfsHelper(edge.des, visit);
            }
        }
    }

    //Delete and Edge from the Graph
    public void deleteEdge(int src, int des){
        adjList.get(src).removeIf(edge -> edge.des == des);
        adjList.get(des).removeIf(edge -> edge.des == src);
    }

    //display
    public void printG(){
        for(int i=0; i<vertices; i++){
            System.out.print("Vertex "+ i + " : ");
            for(Edge edge : adjList.get(i)){
                System.out.print(" -> ( "+edge.des + " , "+edge.wt + ")");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        createGraph g = new createGraph(6); // Graph with 5 vertices

        g.addEdge(0,1,0);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 4);
        g.addEdge(1, 4, 9);
        g.addEdge(3, 4, 1);
        g.addEdge(4, 5, 3);

        g.printG();
        g.bfs(4);
        g.dfs(4);

        System.out.println("Deleting a (1,4) ");
        g.deleteEdge(1,4);

        System.out.println("Graph after delete Edge ");
        g.printG();

    }
}
