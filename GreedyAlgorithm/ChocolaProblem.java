package GreedyAlgorithm;
import java.util.*;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args){
        // int n = 4, m = 6; //rows and columns
        Integer vCost[] = {2, 1, 3, 1, 4}; //m-1
        Integer hCost[] = {4, 1, 2}; //n-1

        Arrays.sort(vCost, Collections.reverseOrder());
        Arrays.sort(hCost, Collections.reverseOrder());

        int h = 0, v = 0; //horizontal cuts or vertical cuts
        int hp = 1, vp = 1; //chocolates pices
        int cost = 0;

        while(h < hCost.length && v < vCost.length){
            if(vCost[v] <= hCost[h]){ //horizonal cut
                cost += (hCost[h]*vp);
                hp++;
                h++;
            } else { //vertival cut
                cost += (vCost[v] * hp);
                vp++;
                v++;
            }
        }

        
        while(h < hCost.length){
            cost += (hCost[h] * vp);
            hp++;
            h++;
        }

        while(v < vCost.length){
            cost += (vCost[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Min cost of cuts = "+ cost);
    }
    
}
