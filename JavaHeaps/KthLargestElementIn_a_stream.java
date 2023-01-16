package JavaHeaps;
import java.util.*;

public class KthLargestElementIn_a_stream {

    public static ArrayList<Integer> getAllKtjNumber(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(pq.size() < k){
                pq.add(arr[i]);
            } else{
                if(arr[i] > pq.peek()){
                    pq.poll(); //remove
                    pq.add(arr[i]);   
                }
            }
            
        }
        if(pq.size() >= k){
            list.add(pq.peek());
        } else{
            list.add(-1);
        }

        // third largest list
        // while(!pq.isEmpty()){
        //     list.add(pq.remove());
        // }

            return list;
    
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 3;

        ArrayList<Integer> res = getAllKtjNumber(arr, k);

        //print kth largest
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
