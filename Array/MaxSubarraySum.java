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
        prefixArr[0] = arr[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefixArr[i] : prefixArr[j] - prefixArr[i - 1];
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
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (currSum > largestSubarraySum) {
                    largestSubarraySum = currSum;
                }
            }
        }
        System.out.println("Largest subarray sum : " + largestSubarraySum);
    }

    public static void main(String[] args) {
        int arr[] = { -11, -2, -1 };
        // maxsubarraySum(arr);
        maxsubarraySum2(arr);
        // kadanes(arr);
    }
}
