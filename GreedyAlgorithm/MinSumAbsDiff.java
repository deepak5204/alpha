/*
 Given two arrays A and B of equal length n. Pair each element of array A  to an element in array B, such that sum S of absolute differences of all the pairs is minimum.
 
 Sample input : A = [1, 2, 3]
                B = [2, 1, 3]

Sample output: 0
 */


package GreedyAlgorithm;
import java.util.*;

public class MinSumAbsDiff {
    public static void main(String[] args){
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i =0; i < A.length; i++){
            minDiff +=Math.abs(A[i] - B[i]);
        }

        System.out.println("min absolute diff of pairs = "+minDiff);

    }
}
