/* 
    Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] 
    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets
 */


package Array;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Triplet {

    public static ArrayList<ArrayList<Integer>> printTriplet(int[] nums) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        // System.out.println(nums[i]+", "+nums[j]+", "+nums[k]);
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        result.add(triplet);
                    }
                }
            }
        }
       result = new ArrayList<ArrayList<Integer>> (new LinkedHashSet<ArrayList<Integer>> (result));
       return result;
    }
    public static void main(String[] args) {
        int [] nums = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> res = printTriplet(nums);

        for(int i =0; i < res.size(); i++){
            System.out.println(res.get(i));

        }
    }
    
}
