package Array;

public class MaxSubarraySum {

    // calcule maxsubarraySum using Kadane's algorithm
    public static void kadanes(int[] arr) {
        // //is all array element negative
        int maxSum = Integer.MIN_VALUE;
        // int max = inte
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                c++;
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
            } else {
                maxSum = Integer.MIN_VALUE;
                break;
            }
        }
        if (c == arr.length) {
            System.out.println("Maximum subarray sum : " + maxSum);
            return;
        } 

        // if all elements are not negative
        else {
            int currSum = 0;
            for (int i = 0; i < arr.length; i++) {
                currSum += arr[i];
                if (currSum < 0) {
                    currSum = 0;
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("Maximum subarray sum : " + maxSum);
        }
    }

    // calcule maxsubarraySum using prefix array
    public static void maxsubarraySum2(int[] arr) {
        int largestSubarraySum = Integer.MIN_VALUE;
        int[] prefixArr = new int[arr.length];

        //calculate prefix array
        prefixArr[0] = arr[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = i == 0 ? prefixArr[start] : prefixArr[end] - prefixArr[start - 1];
            }
            if (largestSubarraySum < currSum) {
                largestSubarraySum = currSum;
            }
        }
        System.out.println("Largest subarray sum : " + largestSubarraySum);
    }

    // brute force method
    public static void maxsubarraySum(int[] arr) {
        int largestSubarraySum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.print(currSum+" ");
                if (currSum > largestSubarraySum) {
                    largestSubarraySum = currSum;
                }
            }
        }
        System.out.println("Largest subarray sum : " + largestSubarraySum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        maxsubarraySum(arr);
        // maxsubarraySum2(arr);
        // kadanes(arr);
    }
}
