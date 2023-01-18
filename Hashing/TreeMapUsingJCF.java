package Hashing;

import java.util.TreeMap;

public class TreeMapUsingJCF {
    public static void main(String[] args){
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 140);
        tm.put("Chaina", 150);
        tm.put("USA", 50);
        tm.put("South Africa", 30);

        System.out.println(tm);
    }
}
