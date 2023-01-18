package Hashing;

import java.util.LinkedHashMap;

public class LinkedHashMapUsingJCF{
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 140);
        lhm.put("Chaina", 150);
        lhm.put("USA", 50);

        System.out.println(lhm);
    }
}