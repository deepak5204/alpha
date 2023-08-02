package Graph;
import java.util.*;

public class ConnectingCities {

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

    public static void createGraph(int[][] cities, ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < cities.length; i++){
            for(int j = 0; j < cities[1].length; j++){
                int src = i;
                int dest = j;
                int wt = cities[i][j];

                if(wt != 0){
                    Edge e = new Edge(src, dest, wt);
                    graph[src].add(e);
                }
            }
        }
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;
        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void cheapestCost(ArrayList<Edge>[] graph, int src){
        boolean [] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalCost = 0;
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.cost;

                for(int i = 0; i < graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.print("Minimum cost of connecting cities = "+ finalCost);
    }
    public static void main(String[] args){
        int cities [][] = { {0, 1, 2, 3, 4},
                            {1, 0, 5, 0, 7},
                            {2, 5, 0, 6, 0},
                            {3, 0, 6, 0, 0},
                            {4, 7, 0, 0, 0}    
                          };

        int v = cities.length;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(cities, graph);
        cheapestCost(graph, 0);
    }
}
