package Graph;

import java.util.*;

public class CycleDetection_UG_DFS {
    static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // for index 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // for index 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // for index 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // for index 3
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // for index 4
        graph[4].add(new Edge(4, 3));
        
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> [] graph, boolean[] vis, int curr, int par){
        vis[curr] = true;
        
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case 3
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            //case 1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            // case 2 -> do nothing -> continue
        }
        return false;
    }
    public static void main(String[] args){
        /*
                    0 ------ 3
                   /|        |
                  / |        |
                 1  |        4
                  \ |
                   \|
                    2
        */

        int V = 5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        
        createGraph(graph);
        boolean res = detectCycle(graph);
        System.out.println(res);

    }  
}
