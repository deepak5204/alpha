package Backtracking;

public class Grid {

    public static int gridWays(int row, int col, int m, int n){
        //base case
        if(row == m-1 && col == n-1){
            return 1;
        } else if(row == m || col == n){
            return 0;
        }

        int w1 = gridWays(row + 1, col, m, n);
        int w2 = gridWays(row, col + 1, m, n);
        return w1 + w2;
    }
    public static void main(String[] args){
        int m = 3, n = 3;
        
        int totalWays = gridWays(0, 0, m, n);
        System.out.println(totalWays);
    }
}
