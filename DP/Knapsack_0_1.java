package DP;

public class Knapsack_0_1 {


    public static void printdp(int[][] dp){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[1].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    // USING RECURSION - TC :- O(2^n)
    public static int knapsack(int[] val, int[] wt, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        int V = val[n - 1];
        int Iwt = wt[n - 1];
        if (Iwt <= W) {
            int incPro = V + knapsack(val, wt, W - Iwt, n - 1);
            int excPro = knapsack(val, wt, W, n - 1);
            return Math.max(incPro, excPro);
        } else {
            return knapsack(val, wt, W, n - 1);
        }
    }

    // USING DP - MEMOIZATION - TC - O(n * w)
    public static int knapsackMemo(int[] val, int[] wt, int W, int n, int[][] dp) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        int V = val[n - 1];
        int Iwt = wt[n - 1];

        if (Iwt <= W) {
            int incPro = V + knapsackMemo(val, wt, W - Iwt, n - 1, dp);
            int excPro = knapsackMemo(val, wt, W, n - 1, dp);
            int maxPro = Math.max(incPro, excPro);
            dp[n][W] = maxPro;
            return dp[n][W];
        } else {
            int excPro = knapsackMemo(val, wt, W, n - 1, dp);
            dp[n][W] = excPro;
            return dp[n][W];
        }
    }


    public static int knapsackTab(int[] val, int [] wt, int w){
        int n = val.length;
        int[][] dp = new int[n+1][w+1];
        for(int i = 0; i < n +1; i++){
            dp[i][0] = 0;
        }

        for(int j = 0; j < w+1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < w+1; j++){
                int v = val[i-1];
                int Iwt = wt[i-1];

                if(Iwt <= j){
                    int incPro = v + dp[i-1][j-Iwt];
                    int excPro = dp[i-1][j];

                    dp[i][j] = Math.max(incPro, excPro);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        printdp(dp);
        return dp[n][w];
    }

    public static void main(String[] args) {
        int[] val = { 10, 20,15, 14 };
        int[] wt = { 2, 5,7, 3 };
        int W = 10;
        int noOfItem = val.length;
        int result = 0;
        result = knapsack(val, wt, W, noOfItem);
        int[][] dp = new int[val.length + 1][W + 1];
        for (int i = 0; i < val.length + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }
        // result = knapsackMemo(val, wt, W, noOfItem, dp);
        result = knapsackTab(val, wt, W);
        System.out.println(result);
    }

}
