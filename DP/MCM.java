package DP;
import java.util.*;

public class MCM {

    public static int mcm(int[] arr, int i, int j){
        // System.out.println(i+" , "+j);
        if(i == j){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int k = i;  k <= j-1; k++){
            int cost1 = mcm(arr, i, k);  //Ai.....Ak => arr[i-1] x arr[k]
            int cost2 = mcm(arr, k + 1, j); //Ak.....Aj => arr[k] x arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            
            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans, finalCost);
        }
        return ans; // minimum cost
    }

    public static int mcmMemo(int [] arr, int i, int j, int[][] dp){
        if( i == j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int cost1 = mcmMemo(arr, i, k, dp); //Ai......Ak  => arr[i - 1] * arr[k]
            int cost2 = mcmMemo(arr, k + 1, j, dp); //Ak+1......Aj => arr[k] * arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(finalCost, ans);
        }
        dp[i][j] = ans;
        return dp[i][j];
    }

    //TABULATION
    public static int mcmTab(int[] arr){
        int n = arr.length;

        //create table
        int[][] dp = new int[n][n];

        //initialize
        for(int i = 0; i < n; i++){
            dp[i][i] = 0;
        }

        //filling
        for(int len = 2; len < n; len++){
            for(int i = 1; i <= n - len; i++){
                int j = i + len - 1;

                for(int k = i; k < j; k++ ){
                    dp[i][j] = Integer.MAX_VALUE;
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }

        printdp(dp);
        return dp[1][n - 1];
    }



    //print dp 
    public static void printdp(int[][] dp){
        for(int i = 0; i < dp.length; i++){
            for(int j  = 0; j< dp[0].length; j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println("Recursion: "+mcm(arr, 1, n-1));

        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        System.out.println("Memoization: "+ mcmMemo(arr, 1, n - 1, dp));

        System.out.println("Tabulation: "+ mcmTab(arr));

    }
}
