package Graph;
import java.util.*;
public class CreateGraph {
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
    public static void main(String[] args){
        /*
                       (2)
                    0 ----- 1
                           / \
                       (1)/   \(3)
                         /     \
                        /       \
                       2 ------- 3
                       |   (1)
                    (2)|
                       |
                       4         

         */

         int v = 5; // number of vertices in graph
         //int arr[] = new int[v];
        
         ArrayList<Edge>[] graph = new ArrayList[v]; // Null -> empty ArrayList

         for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
         }

        //  vertex 0
        graph[0].add(new Edge(0, 1, 2));

         //  vertex 1
         graph[1].add(new Edge(1, 0, 2));
         graph[1].add(new Edge(1, 2, 1));
         graph[1].add(new Edge(1, 3, 3));

         
         //  vertex 2
         graph[2].add(new Edge(2, 1, 1));
         graph[2].add(new Edge(2, 3, 1));
         graph[2].add(new Edge(2, 4, 2));


         
         //  vertex 3
         graph[3].add(new Edge(3, 2, 1));
         graph[3].add(new Edge(3, 1, 3));
        
        //  vertex 4
        graph[4].add(new Edge(4, 2, 2));


        //PRINT COMPLETE GRAPH
        for(int i = 0; i < v; i++){
            System.out.print(graph[i].get(0).src+" -> ");
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                System.out.print(e.dest+" ");
            }
            System.out.println();
        } 

        System.out.println();


        //print 2's neighbours 
        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i); //src, dest, wt
            System.out.print(e.dest+" ");
        }
    }
}
