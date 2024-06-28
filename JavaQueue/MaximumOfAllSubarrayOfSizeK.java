package JavaQueue;

import java.util.*;

public class MaximumOfAllSubarrayOfSizeK {

    public static void printMax(int[] arr,int n, int k){
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < n; i++){ 
            if(!deque.isEmpty() && deque.peek() < i - k + 1){
                deque.removeFirst();
            }

            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]){
                deque.removeLast();
            }

            deque.addLast(i);
            if(i >= k - 1){
                System.out.print(arr[deque.peekFirst()] +" ");
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {1, 3, 2, 5};
        int k = 2;
        printMax(arr, arr.length, k);
    }
}
