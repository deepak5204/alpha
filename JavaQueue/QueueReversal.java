package JavaQueue;
import java.util.*;
public class QueueReversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        
        //element remove from queue and push in stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        //element pop from stack and add in queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        //print queue
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
