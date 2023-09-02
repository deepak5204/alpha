package DP;

public class MinimumPartitioning {

    public static int minDiff(int[] nums){
        int n = nums.length;

        //calculate sum of all elememnts
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        int W = sum /2;

        //create table
        int[][] dp = new int[n + 1][W + 1];

        //initialize the dp
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < W; j++){
            dp[0][j] = 0;
        }

        //fill bottom up manner
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < W + 1; j++){
                //check valid or not
                int val = nums[i - 1];
                if(val <= j){
                    int ans1 = val + dp[i-1][j - val];  //include
                    int ans2 = dp[i-1][j]; //exclude
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        int sum1 = dp[n][W];
        
        int sum2 = sum - sum1;
        
        printdp(dp);
        System.out.println();

        return Math.abs(sum1 - sum2);

    } 

    //print dp
    public static void printdp(int[][] dp){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] numbers = {1, 2, 3};
        
        System.out.println(minDiff(numbers));

    }
}
