package Graph;
import java.util.*;

public class FindMotherVertex {
    static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    public static void helper(ArrayList<Edge>[] graph, boolean[] vis, int curr){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                helper(graph, vis, e.dest);
            }
        }
    }

    public static void motherVertex(ArrayList<Edge> [] graph, int V){
        boolean[] vis = new boolean[V];
        int v = -1;
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                helper(graph, vis, i);
                v = i;
            }
        }

        boolean[] check = new boolean[graph.length];
        helper(graph,check, v);
        for (boolean val : check) {
            if (!val) {
                System.out.print(-1);
            }
        }
        System.out.print(v);
    
    }

    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);
        motherVertex(graph, V);
    }
    
}
