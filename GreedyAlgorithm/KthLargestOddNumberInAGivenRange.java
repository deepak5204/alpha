package GreedyAlgorithm;

public class KthLargestOddNumberInAGivenRange {
    public static int kthOdd(int[] range,int k){
        if(k <= 0){
            return 0;
        }

        int l = range[0];
        int r = range[1];

        if((r&1) > 0){
            int count = (int) Math.ceil((r-l+1)/2);
            if(k > count){
                return 0;
            } else {
                return (r - 2 * k + 2);
            }
        } else {
            int count = (r - l + 1)/2;
            if(k > count){
                return 0;
            } else {
              return (r-2 *  k+1);
            }
        }

    }
    public static void main(String[] args){
        int[] p = {-10, 10};
        int k = 4;
        int res = kthOdd(p, k);
        System.out.println(res);

    }
}
