/* Given a "2 x n" board and tiles of size "2 x 1", count number of
    ways to tile the given board using the 2 x 1 tiles.
    (A tile can either be placed horizontally or vertically.)
 */

package Recursion;

import java.util.Scanner;

public class TilingProblem {

    public static int arrangeTiles(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //arrange vertically
        int vert = arrangeTiles(n-1);
        //arrange Horizontal
        int horiz = arrangeTiles(n-2);

        int noOfWays = vert + horiz;
        return noOfWays;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int floorSize =  sc.nextInt();
        sc.close();
        int res = arrangeTiles(floorSize);
        System.out.println(res);

    }
}
