package DP;

public class UnboundedKnpasack {

    public static int calcMaxProfit(int[] val, int[] wt, int w){
        int n = val.length;
        int[][] dp = new int[n+1][w+1];

        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 0;
        }

        for(int j = 0; j < w + 1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < w + 1; j++){
                int ival = val[i-1];
                int iwt = wt[i-1];

                if(iwt <= j){
                    int incProfit = ival + dp[i][j - iwt];
                    int excProfit = dp[i - 1][j];
                      dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        printDP(dp);
        return dp[n][w];
    }

    public static void printDP(int[][] dp){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = { 2, 5, 1, 3, 4};
        int W = 7;

        System.out.print(calcMaxProfit(val, wt, W));
    }
}
