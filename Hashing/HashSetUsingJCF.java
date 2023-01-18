package Hashing;

import java.util.*;

public class HashSetUsingJCF {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(2);
        hs.add(null);

        System.out.println(hs);
        hs.remove(2);
        System.out.println(hs);

        hs.clear();
        System.out.println(hs);

    }
}
