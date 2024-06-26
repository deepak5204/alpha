/*
 * You are given 'n' activity with their 'n' start and 'n' end time. Select the maximum number of activities that can be 
 * performed by a single person, assuming that a person can only work on a single activity at a time.
 *  Activities are sorted according to end time.
 *      int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
 */


package GreedyAlgorithm;
import java. util.*;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        //sorting
        int[][] activities = new int[start.length][3];
        for(int i = 0; i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function -> short form of big function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time sorted basis
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>(); 
        //-------------------------- Approach 2--------------------------
        // 1st activity 
        // maxAct = 1;
        // ans.add(activities[0][0]);
        // int lastEnd = activities[0][2];
        // for(int i = 1; i < end.length; i++){
        //     if(activities[i][1] >= lastEnd){
        //         //activity select
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastEnd = activities[i][2];
        //     }
        // }




        //----------------------------- Approach 1--------------------------
        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 1; i < end.length; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = "+maxAct);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

        
    }
}
