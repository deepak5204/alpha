package DP;
import java.util.*;

public class CatalanNumber {

    //RECURSION
    public static int calcCatalan(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){ 
            ans += calcCatalan(i) * calcCatalan(n - i - 1);
        }
        return ans;
    }

    //MEMOIZATION
    public static int calcCatalan2(int n, int[] dp){
        if(n == 0 || n == 1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += calcCatalan2(i, dp) * calcCatalan2(n - i - 1, dp);
            dp[n] = ans;
        }
        return dp[n];
    }


    //TABULATION
    public static int calcCatalan3(int n){
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < n + 1 ; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Recursion: "+calcCatalan(n));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        System.out.println("Memoization: "+calcCatalan2(n, dp));

        System.out.println("Tabulation: "+ calcCatalan3(n));
    }
}
