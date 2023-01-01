package GreedyAlgorithm;

public class MaxBalancedStrPartition {

    public static int balancedPartition(String str,int n){
        if(n == 0){
            return 0;
        }
        int r = 0, l = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'R'){
                r++;
            }
            else if(str.charAt(i) == 'L'){
                l++;
            }
            if(r == l){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
    // String str = "RLRRLLRLRL";  // O/P-4
    String str = "RLLLLRRRLR";  //O/P - 3
    int n = str.length();
    int res = balancedPartition(str, n); 
    System.out.println(res);
    }
}
