package DivideAndConquer;

public class MajorityElement {

    //divide and conquer approach :- TC - O(nlogn)
    public static int findMaforityElts(int[] arr){
        return majorityElts(arr, 0, arr.length-1);
    }

    public static int majorityElts(int[] arr, int si, int ei){
        //base case; the only element in an arrayof size 1 is the majority element
        if(si == ei){
            return arr[si];
        }

        int mid = si + (ei - si)/2;
        int left = majorityElts(arr, si, mid);
        int right = majorityElts(arr, mid+1, ei);

        //if the two halfs agree on the majority element, return it.
        if(left == right){
            return left;
        }

        //otherwise count each element and return the majority
        int leftCount = countInRange(arr, left, si, ei);
        int rightCount = countInRange(arr, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int countInRange(int[] arr, int num, int si, int ei){
        int count = 0;
        for(int i = si;i <= ei; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr ={2, 2, 1, 1, 1};
        int majority = findMaforityElts(arr);
        System.out.println(majority);
    }

    // //Moore's voting algorithms
    // private static int findMaforityElts(int[] arr) {
    //     int count = 1; int res = 0;

    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[res] == arr[i]){
    //             count++;
    //         } else {
    //             count--;
    //         }

    //         if(count == 0){
    //             count = 1;
    //             res = i;
    //         }
    //     }

    //     //check element is in majority or not
    //     count = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == arr[res]){
    //             count++;
    //         }
    //     }

    //     if(arr.length/2 < count){
    //         return arr[res];
    //     } else{
    //         return -1;
    //     }
    // }
}
