package Hashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = { 2, 7, 11, 15};
        int k = 13;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(k- arr[i])){
                System.out.println("["+i+","+map.get(k- arr[i])+"]");
                break;
            }
        }
    }
}
