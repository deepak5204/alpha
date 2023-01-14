package JavaHeaps;
import java.util.*;

public class PQ_In_JCF{
    public static void main(String[] args){
        //1, 2, 3, 4

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // reverse the priority
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}