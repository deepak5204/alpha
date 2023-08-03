// Given a m X n integer grid image where image [i][j] represents the pixel value of the image.
// You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from
// the pixel image[sr][sc].
// To perform a flood fill, consi der the starting pixel, plus any pixels connected 4-directionally to the starting
// pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels(also with the same color), and so on.
// Replace the color of all of the aforementioned pixels with color.

// image = [[1, 1, 1]
//          [1, 1, 0]
//          [1, 0, 1]]

//sr = 1, sc = 1, color = 2

// ans = [[2, 2, 2]
//        [2, 2, 0]
//        [2, 0, 1]]


package Graph;
import java.util.*;

public class FloodFillAlgorithm{

    // O(m*n)
    public static void helper (int[][] image, int sr, int sc, int color, boolean[][] vis, int orgColor){
        //base case
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc]|| image[sr][sc] != orgColor){
            return;
        }

        image[sr][sc] = color;
        vis[sr][sc] = true;

        //left
            helper(image, sr, sc-1, color, vis, orgColor);
        // right
            helper(image, sr, sc+1, color, vis, orgColor);
        //up
            helper(image, sr-1, sc, color, vis, orgColor);
        // down
            helper(image, sr+1, sc, color, vis, orgColor);
    }

    public static int[][] floodFill(int [][] image, int sr, int sc, int color){
        boolean [][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String [] args){
        int [][] image = {{1, 1, 1},
                          {1, 1, 0},
                          {1, 0, 1}};
        
        int sr = 1;
        int sc = 1;
        int color = 2;

        floodFill(image, sr, sc, color);

        //print image 
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}