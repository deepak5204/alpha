package Hashing;
import java.util.*;
public class SortByFrequency {

    static class Info implements Comparable<Info> {
        char ch;
        int freq;

        Info(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }

        @Override
        public int compareTo(Info s2){
            return s2.freq - this.freq;
        }

    }
    public static void main(String[] args){
        String s = "aabbbccccddddd";

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        PriorityQueue<Info> pq = new PriorityQueue<>();

        int i = 0;
        while(!map.isEmpty() && i< s.length()){
            char ch = s.charAt(i);
           if(map.containsKey(ch)){
            pq.add(new Info(ch, map.get(ch)));
            map.remove(ch);
           }
            i++;
        }

       while(!pq.isEmpty()){
        Info curr = pq.remove();
        for(int j = curr.freq; j > 0; j--){
            System.out.print(curr.ch);
        }
       }  
    }
}
