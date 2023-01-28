package Graph;

import java.util.ArrayList;

public class GraphTraversalDFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
         // for vertex 0
         graph[0].add(new Edge(0, 1, 1));
         graph[0].add(new Edge(0, 2, 1));
 
         // for vertex 1
         graph[1].add(new Edge(1, 0, 1));
         graph[1].add(new Edge(1, 3, 1));
 
         // for vertex 2
         graph[2].add(new Edge(2, 0, 1));
         graph[2].add(new Edge(2, 4, 1));
 
         // for vertex 3
         graph[3].add(new Edge(3, 1, 1));
         graph[3].add(new Edge(3, 4, 1));
         graph[3].add(new Edge(3, 5, 1));
 
         // for vertex 4
         graph[4].add(new Edge(4, 2, 1));
         graph[4].add(new Edge(4, 3, 1));
         graph[4].add(new Edge(4, 5, 1));
 
         // for vertex 5
         graph[5].add(new Edge(5, 3, 1));
         graph[5].add(new Edge(5, 4, 1));
         graph[5].add(new Edge(5, 6, 1));
 
         // for vertex 6
         graph[6].add(new Edge(6, 5, 1));
    }

    // O(V+E)
    public static void dfs(ArrayList<Edge> [] graph, int curr, boolean[] vis){
        // visit
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args){
        int V = 7;
        ArrayList<Edge> [] graph = new ArrayList[V];
        //Initialize empty list
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        createGraph(graph);

        boolean[] vis = new boolean[V];

        dfs(graph, 5, vis);

    }
}
