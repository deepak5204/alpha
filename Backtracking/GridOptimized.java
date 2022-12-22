package Backtracking;

public class GridOptimized {

    public static int calcFacttorial(int n){
        //base case
        if(n == 0){
            return 1;
        }
        
        //kaam
        return n * calcFacttorial(n - 1);
    }

    public static int gridWays(int m, int n){
        return calcFacttorial(n - 1 + m - 1)/(calcFacttorial(n - 1) * calcFacttorial(m - 1));
    }
   public static void main(String[] args){
    int m =3, n = 3;
    int totalWays = gridWays(m,n);
    System.out.println(totalWays);
   }
    
}
