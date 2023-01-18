package Hashing;
import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args){
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        //Union
        for(Integer k : arr1){
            set.add(k);
        }
        for(Integer k : arr2){
            set.add(k);
        }
        System.out.println(set);
        System.out.println("Union = "+set.size());
        set.clear();

        //Intersection
        for(Integer k : arr1){
            set.add(k);
        }

        int count = 0;
        for(Integer k : arr2){
            if(set.contains(k)){
                count++;
                System.out.print(k+" ");
                set.remove(k);
            }
        }
        System.out.println();
        System.out.println("Intersection = "+ count);
    }
}
