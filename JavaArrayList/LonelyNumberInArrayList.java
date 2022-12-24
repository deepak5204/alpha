package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumberInArrayList {

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list){
        if(list.size() == 1){
            return list;
        }
        Collections.sort(list);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 1; i < list.size()-1; i++){
            if(list.get(i - 1)+1 < list.get(i) && list.get(i) + 1 < list.get(i+1)){
                temp.add(list.get(i));
            }
        } 
        
        if(list.size() > 1){
            if(list.get(0)+1 != list.get(1)){
                temp.add(list.get(0));
            }

            if(list.get(list.size()-2)+1 != list.get(list.size()-1)){
                temp.add(list.get(list.size()-1));
            }
        }

        return temp;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // 10, 6, 5, 8
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.println(lonelyNumber(list));
    }
}
