package Array;

public class FindLargestAndSmallest {
    //find largest
    public static void largest(int [] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest :"+largest);
    }

    //find smallest
    public static void smallest(int [] arr) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] < smallest ){
                smallest = arr[i];
            }
        }
        System.out.println("smallest :"+smallest);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        largest(arr);
        smallest(arr);



    }
}
