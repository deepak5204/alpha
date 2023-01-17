package Hashing;
import java.util.*;

public class HashMapUsingJCF {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 140);
        hm.put("Chaina", 150);
        hm.put("USA", 30);

        System.out.println(hm);

        System.out.println(hm.get("India"));

        System.out.println(hm.remove("Chaina"));
        System.out.println(hm);

        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm);

        System.out.println(hm.isEmpty());
    }
}
