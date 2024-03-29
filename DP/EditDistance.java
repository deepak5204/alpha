package DP;

public class EditDistance {

    public static int convert(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];
        
        //initialize
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){

                //if String1 is given and String2 is empty
                if(i == 0){
                    dp[i][j] = j;
                }

                // if String1 is empty and string 2 is given
                if(j == 0){
                    dp[i][j] = i;
                }
            }
        }

        // filling
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                //if character same
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                //if character difference
                else {
                    int add = dp[i][j - 1] + 1;
                    int delete = dp[i - 1][j] + 1;
                    int replace = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(add, Math.min(delete, replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        String str1 = "a";
        String str2 = "sb";

        System.out.print("Operation: "+ convert(str1, str2));

    }
}
