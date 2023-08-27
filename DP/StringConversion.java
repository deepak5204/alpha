package DP;

public class StringConversion {

    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];
        
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(str1.charAt(i-1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void convert(String str1, String str2){
        if(str1.length() == 0){
            System.out.println("Delete Opereation: " + 0);
            System.out.println("Insert Opetation: " + str2.length());
        }
        if(str2.length() == 0){
            System.out.println("Delete Opereation: " + str1.length());
            System.out.println("Insert Opetation: " + 0);
        }

        int lcs = lcs(str1, str2);
        System.out.println("LCS: "+ lcs);

        System.out.println("Delete Opereation: " + (str1.length() - lcs));
        System.out.println("Insert Opetation: " + (str2.length() - lcs));
    }
    public static void main(String[] args){
        String str1 = "pear";
        String str2 = "sea";
        
        convert(str1, str2);

    }
    
}
