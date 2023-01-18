package Hashing;
import java.util.*;

public class TreeSetUsingJCF {
    public static void main(String[] args){
        //Sorted in ascending order
        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("Chaina");
        ts.add("Nepal");
        ts.add("Bhutan");

        System.out.println(ts);
    }
}
