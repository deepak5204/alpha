package Array;

public class PrintSubarray {

    // print subarray
    public static void printSubarray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { -11, -2, -1 };
        printSubarray(arr);
    }
}
