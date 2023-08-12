package DP;

public class FibonacciNumber {
     // O(n)
     public static void printFib(int n){
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(0+" "+1+" ");
        
        for(int i = 0; i < n-1; i++){
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm +" ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    
    // O(2^n)
    public static int calcFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return calcFib(n-1)+calcFib(n-2);
    }

    // O(n)    
    // MEMOIZATION - using recursion
    public static int calcFibUsingDP(int n, int[] f){
        if(n == 0 || n == 1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = calcFibUsingDP(n - 1, f) + calcFibUsingDP(n - 2, f);
        return f[n];
    }


    // TABULATION - using iteration
    public static int calcFibTabulation(int n){
        //initialization
        int[] dp = new int[n + 1];
        dp[0] = 0; // we can skip because in java initially integer array filled with 0 
        dp[1] = 1;

        //meaning - do in mind and do in your notebook

        //filling - from smallest to largest
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    //
    public static void main(String[] args) {
        int n = 5;
        printFib(n);
        // System.out.println();
        // System.out.println(calcFib(n));
        
        int[] f = new int [n+1];
        System.out.println(calcFibUsingDP(n, f));

        System.out.println(calcFibTabulation(n));
    }    
}
