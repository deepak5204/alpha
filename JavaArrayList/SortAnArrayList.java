package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class SortAnArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(4);

        System.out.println(list);

        //use Collection class in java for sort ArrayList
        Collections.sort(list); //It sort only in ascending order
        System.out.println(list);

        //use java Comparator for sort in descending order
        //In java Comparator is a function which describe the logic for sort function
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
