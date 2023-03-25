package Graph;
import java.util.*;

public class GraphTraversalBFS {

    //create Node 
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = d;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
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


    //BFS 
    public static void bfs(ArrayList<Edge>[] graph){  // TC- O(v + E)
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0); //source

        while(!q.isEmpty()){
            int curr = q.remove();
            
            if(!vis[curr]){
                System.out.print(curr +" ");
                vis[curr] = true;
                for(int i = 0; i <  graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void main(String[] args){
        /*

            1 ------ 3 
           /         |  \
          /          |    \
        0            |     5 ------ 6   
          \          |    /
           \         |  /
            2 ------ 4 

         */

         int V = 7;
         ArrayList<Edge>[] graph = new ArrayList[V]; //null -> empty

         //initialize null to empty ArrayList
         for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
         }

         createGraph(graph);
         bfs(graph);
    }
}
