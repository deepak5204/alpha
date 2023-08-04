package Graph;
import java.util.*;

public class StronglyConnectedComponent {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 1));
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(0, 3));
        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge>[] graph, boolean[] vis, int curr, Stack<Integer> s){
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, vis, e.dest, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> [] graph, boolean[] vis, int curr){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph, int V){
        // step 1 - store in stack (topological sort)
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                topSort(graph, vis, i, s);
            }
        }

        // step 2 - transpose graph
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for(int i = 0; i < V; i++){
            transpose[i] = new ArrayList<>();
            vis[i] = false;
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j); //e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src)); //reverse edge

            }
        }

        // step 3 - do DFS according to stack
        int count = 1;
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("SCC "+ count +"-> " );
                dfs(transpose, vis, curr);
            }
            count = count + 1;
            System.out.println();
        }
    }
    public static void main(String [] args){
        int V = 5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
