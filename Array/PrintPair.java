package Array;

public class PrintPair {
    
    //print pair
    public static void printpair(int[] arr){
        int largestPairSum = Integer.MIN_VALUE;
        int smallestPairSum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                if(arr[i]+arr[j] > largestPairSum){
                    largestPairSum = arr[i]+arr[j]; 
                } 
                if(arr[i]+arr[j] < smallestPairSum) {
                    smallestPairSum = arr[i]+arr[j];
                }
            }
            System.out.println();
        }

        System.out.println("Largest pair sum :"+ largestPairSum);
        System.out.println("Smallest pair sum :"+ smallestPairSum);
    }
    public static void main(String[] args){
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8};
        printpair(arr);
    }
}
