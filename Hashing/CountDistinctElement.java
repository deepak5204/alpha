package Hashing;
import java.util.*;

public class CountDistinctElement {
    public static void main(String[] args){
        int[] nums = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(Integer i : nums){
            set.add(i);
        }

        System.out.println("ans = "+set.size());

    }
}
