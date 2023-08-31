package DP;

public class LongestCommonSubsequence {

    public static int LCS(String str1, int n, String str2, int m){
        if(n == 0 || m == 0){
            return 0;
        }

        if(str1.charAt(n - 1) == str2.charAt(m - 1)){
            return LCS(str1, n - 1, str2, m - 1) + 1;
        } else {
            int ans = LCS(str1, n - 1, str2, m);
            int ans2 = LCS(str1, n, str2, m - 1);
            return Math.max(ans, ans2);
        }
    }

public static int LCS(String str1, int n, String str2, int m, int[][] dp){
    if( n == 0 || m == 0){
        return 0;
    }

    if(dp[n][m] != -1){
        return dp[n][m];
    }

    if(str1.charAt(n - 1) == str2.charAt(m - 1)){
        return dp[n][m] = LCS(str1, n - 1, str2, m - 1) + 1;
    } else {
        int ans = LCS(str1, n - 1, str2, m);
        int ans2 = LCS(str1, n, str2, m - 1);
        return dp[n][m] = Math.max(ans, ans2);
    }



}
    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "acg";
        int n = str1.length();
        int m = str2.length();

        // System.out.println("Recursion: "+ LCS(str1, n, str2, m));

        int[][] dp = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println("Memoization: "+LCS(str1, n, str2, m, dp));
    }
}
