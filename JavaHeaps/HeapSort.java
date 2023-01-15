package JavaHeaps;

public class HeapSort {

    //heapify for maxheap
    public static void heapify(int[] arr, int i, int size){   // O(nlogn)
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIndex = i;

        if(left < size && arr[left] > arr[maxIndex]){ // arr[left] < arr[minIndex] - for descending order
            maxIndex = left;
        }

        if(right < size && arr[right] > arr[maxIndex]){ // arr[right] < arr[minIndex] - for descending order
            maxIndex = right;
        }

        if(maxIndex != i){
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            heapify(arr, maxIndex, size);
        }

    }

    public static void heapSort(int [] arr){  // O(nlogn)
        //step1 - build maxheap
        int n = arr.length;
        for(int i = n/2; i >= 0; i--){
            heapify(arr, i, n);
        }

        //step2 - push largestat end
        for(int i = n-1; i >= 0; i--){
            //swap largest with end index
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;   

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args){
        int [] arr = {1, 2, 4, 5, 3};
        heapSort(arr);

        //print
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
