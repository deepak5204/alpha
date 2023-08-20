package DP;
import java.util.*;

public class ClimbingStairs {

//using recursion -- O(2^n)
    public static int climbStairsWays(int n){
        if( n == 0){
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        return climbStairsWays(n - 1) + climbStairsWays(n - 2);
    }


//using DP - memoization  -- O(n)
    public static int climbStairsWays2(int n, int[] ways){
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = climbStairsWays2(n - 1, ways) + climbStairsWays2(n - 2, ways);
        return ways[n];
    }


    //USING DP -- TABULATION -- O(n)
    public static int climbStairsWaysTab(int n){
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            } else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println(climbStairsWays(n));
        System.out.println();

        int ways[] = new int[n + 1]; // 0 0 0 0 0.....
        Arrays.fill(ways, -1); // -1 -1 -1 -1....
        System.out.print(climbStairsWays2(n, ways));
        System.out.println();

        System.out.println(climbStairsWaysTab(n));

    }
}
