package Recursion;

public class CountPossiblePathInMaze {

    public static int possiblePath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        //vertical movement
        int ways1 = possiblePath(i+1, j, n, m);

        //horizontal movement
        int ways2 = possiblePath(i, j+1, n, m);
        return ways1 + ways2;
    }
    public static void main(String[] args){
        int n = 3, m = 3;
        int totalPath = possiblePath(0, 0, n, m);
        System.out.println(totalPath);
    }
}
