/*
 Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
Sample Input 1 : N = 4, arr = [4 3 2 6]
Sample Output 1 : 29
Sample Input 2 : N = 2, arr = [1 2 3]
Sample Output 2 : 9
 */


package JavaQueue;

import java.util.PriorityQueue;

public class ConnectNropesWithMinimumC{

    static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i< arr.length; i++){
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first+second);
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {4, 3, 2, 6};

        int ans = minCost(arr);
        System.out.println(ans);
    }
}