package Hashing;
import java.util.*;

public class LinkedHashSetUSingJCF {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("India");
        lhs.add("Chaina");
        lhs.add("Nepal");
        lhs.add("Bhutan");

        System.out.println(lhs);
    }
}
