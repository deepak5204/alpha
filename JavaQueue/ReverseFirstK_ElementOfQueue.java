/*
 * Reversing the first K elements of a Queue
    We have an integer k and a queue of integers, we need to reverse the order of the first k
    elements of the queue, leaving the other elements in the same relative order.

    Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
    Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
 */


package JavaQueue;

import java.util.*;

public class ReverseFirstK_ElementOfQueue {

    public static void reverseKelement(Queue<Integer> q , int k){
        if(q.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(k > q.size()){
            System.out.println("Invalid value for k");
            return;
        }

        Stack<Integer> s = new Stack<>();

        int n = k;

        //remove first k element from queue
        while(k > 0){
            s.push(q.remove());
            k--;
        }

        // add element in reverse order from last 
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        // now remove remaining element and add in last
        int b = q.size() - n;
        while(b > 0){
            q.add(q.remove());
            b--;   
        }


        //print queue element after reverse k element
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }


    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            q.add(i * 10);
        }

        int k = 5;
        reverseKelement(q, k);
    }
}
