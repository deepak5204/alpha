package JavaArrayList;

import java.util.ArrayList;

public class MostFrquentNumberFollowingKey {

    public static int frequentNumber(ArrayList<Integer> list, int key){
       int[] result = new int[1000];
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == key){
                result[list.get(i+1)]++;
            }
        }

       int max = Integer.MIN_VALUE;
       int ans = 0;
        for(int i = 1; i < 1000; i++){
            if(result[i] > max){
                max = result[i];
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        //1, 100, 200, 1, 100,  key = 1

        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        int key = 1; 

        System.out.println(frequentNumber(list, key));

    }
}
