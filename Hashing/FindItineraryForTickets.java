package Hashing;
import java.util.*;

public class FindItineraryForTickets {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String k : tickets.keySet()){
            revMap.put(tickets.get(k), k);
        }

        //startplace
        for(String k : tickets.keySet()){
            if(!revMap.containsKey(k)){
                return k;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        while(tickets.size() > 0){
            String temp = start;
            System.out.print(" -> "+ tickets.get(start));
            start = tickets.get(start);
            tickets.remove(temp);

        }


    }
}
