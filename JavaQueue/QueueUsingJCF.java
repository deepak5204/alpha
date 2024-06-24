package JavaQueue;
import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args){
        //here we cannot create Queue object because Queue is an interface
        // In Java Queue is implemented by "Linked List" and "ArrayDeque"
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

/* 
//  LinkedList
>>  Underlying Structure: LinkedList is implemented as a doubly-linked list.   Each element (node) holds a reference to both the next and previous elements in the list.
>>  Memory Overhead: Higher memory overhead due to the storage of multiple references (two per element: next and previous).

//  ArrayDeque
>>  Underlying Structure: ArrayDeque is implemented using a resizable array. It maintains a circular buffer to store elements.
>>  Memory Overhead: Lower memory overhead compared to LinkedList as it only stores the elements and a few integer variables for managing the circular buffer.
*/