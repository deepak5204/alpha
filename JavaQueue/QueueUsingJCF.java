package JavaQueue;
import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args){
        //here we cannot create Queue object because Queue is an interface
        // Queue<Integer> q = new LinkedList<>();  //ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
