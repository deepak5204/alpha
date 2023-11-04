package DivideAndConquer;

public class QuickSort {

    // print array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //CONSIDER ENDING INDEX IS PIVOT
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // place pivot element its right position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        // return correct position of pivot element
        return i;
    }


     //CONSIDER STARTING INDEX IS PIVOT
     public static int partition2(int[] arr, int si, int ei){
        int pivot = arr[si];
        int left = si + 1;
        int right = ei;
        boolean flag = false;

        while(!flag){

            //move left until element greater than pivot
            while(left <= right && arr[left] < pivot){
                left++;
            }

            //mover right until element lesser than pivot
            while(arr[right] >= pivot && right >= left){
                right--;
            }

           if(left > right){
               flag = true;
           } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
           }
        }

        int temp = arr[si];
        arr[si] = arr[right];
        arr[right] = temp;

        return right;
    }

    // qick sort
    public static void quickSort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // int pivotIdx = partition(arr, si, ei);
        int pivotIdx = partition2(arr, si, ei);
        quickSort(arr, si, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, ei);
    }

    public static void main(String[] args) {
        int[] arr = { -7, 2, 3, 5, 7, 3, 9, 1 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
