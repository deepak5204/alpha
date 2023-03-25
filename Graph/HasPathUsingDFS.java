package Graph;
import java.util.*;

public class HasPathUsingDFS {
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


    //create graph
    public static void CreateGraph(ArrayList<Edge>[] graph){
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

    //check has path 
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visit){ //TC- O(V + E)
        if(src == dest){
            return true;
        }
        visit[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.des = neighbour
            if(!visit[e.dest] && hasPath(graph, e.dest, dest, visit)){
                return true;
            }
        }
        return false;
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
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        CreateGraph(graph);

        boolean res = hasPath(graph, 1, 6, new boolean[V]);
        System.out.println(res);
    }
}
