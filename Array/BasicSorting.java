package Array;

public class BasicSorting {

    // counting sort
    public static void countingSort(int[] arr) {
        // int startRange = Integer.MAX_VALUE;
        int endRange = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // startRange = Math.min(startRange, arr[i]);
            endRange = Math.max(endRange, arr[i]);
        }

        // create frequency array
        int[] freqArray = new int[endRange + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]] += 1;
        }

        // // print frequency arrayarray
        // for (int i = 0; i < freqArray.length; i++) {
        //     System.out.print(freqArray[i] + " ");
        // }

        //print sorted array using frequency array
        for(int i = freqArray.length - 1; i >= 0; i--){
            int noTimes = freqArray[i];
            while(noTimes > 0){
                System.out.print(i+" ");
                noTimes--;
            }
        }
    }

    // Insertion sort
    public static void insertionSort(int[] arr) {
        // outer loop
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // place arr[i] at correct position
            arr[prev + 1] = temp;

            // inner loop
            // for(int j = i - 1; j >= 0; j--){
            // if(arr[j] > temp){
            // arr[j+1] = arr[j];
            // } else {
            // break;
            // }
            // arr[j] = temp;
            // }
        }
    }

    // selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestPos] < arr[j]) {
                    smallestPos = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[smallestPos];
            arr[smallestPos] = temp;
        }
    }

    // bubble sort
    public static void bubbleSort(int[] arr) {
        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;

            // inner loop
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                return;
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        // print(arr);
    }
}
