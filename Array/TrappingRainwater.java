/*
  Given a non-negative integers representing an elevation map where the width of each bar is 1, 
  compute how much water it can trap after raining

  height = {4, 2, 0, 6, 3, 2, 5}
 */

package Array;
public class TrappingRainwater {
    public static void totalTrappedwater(int[] height) {
        int LMB[] = new int[height.length];
        int lmax = height[0];
        LMB[0] = lmax;
        for (int i = 1; i < LMB.length; i++) {
            if (height[i] > LMB[i - 1]) {
                LMB[i] = height[i];
                lmax = height[i];
            } else {
                LMB[i] = lmax;
            }
        }
        // // print Left Max Boundary
        // for (int i = 0; i < LMB.length; i++) {
        // System.out.print(LMB[i] + " ");
        // }

        System.out.println();
        int RMB[] = new int[height.length];
        int rmax = height[height.length - 1];
        RMB[RMB.length - 1] = rmax;
        for (int i = RMB.length - 1 - 1; i >= 0; i--) {
            if (height[i] > RMB[i + 1]) {
                RMB[i] = height[i];
                rmax = height[i];
            } else {
                RMB[i] = rmax;
            }
        }
        // // print Right Max Boundary
        // for (int i = 0; i < LMB.length; i++) {
        // System.out.print(RMB[i] + " ");
        // }

        // calculate total trapped watersum
        // waterLabel = min(max of LMB, max of RMB )
        //  trapped water = waterLabel - height
        int totalTrappedWater = 0;
        int waterLabel = 0;
        for (int i = 0; i < height.length; i++) {
            waterLabel = LMB[i] < RMB[i] ? LMB[i] : RMB[i];

            if (waterLabel - height[i] < 0) {
                totalTrappedWater += 0;
            } else {
                totalTrappedWater += waterLabel - height[i];
            }
        }
        System.out.println("Total trapped water : " + totalTrappedWater);
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        totalTrappedwater(height);
    }
}