/*
 * We have an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
 * 
 */


package JavaStack;

import java.util.Stack;

public class TrappingRainWater {

    public static int totalTrappedWater(int[] height){
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && height[s.peek()] < height[i]){
                int pop_height = height[s.peek()];
                s.pop();

                if(s.isEmpty()){
                    break;
                }

                int distance = i - s.peek() - 1;
                int minHeight = Math.min(height[s.peek()], height[i]) - pop_height;

                ans += distance * minHeight;
            }
            s.push(i);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] height = {6, 2, 4, 1, 6, 1, 5};
        int res = totalTrappedWater(height);
        System.out.println("Total trapped water: "+ res);
    }    
}
