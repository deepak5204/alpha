package DivideAndConquer;

public class MergeSort {

    //print array
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //conquer the sorted array
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp array
        
        //compare left part and right part and store
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //if left part elements remain
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //if right part elements remain
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp array into original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    //divide array
    public static void divide(int[] arr, int si, int ei){
        //base case
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        divide(arr, si, mid); //left part
        divide(arr, mid+1, ei); //right part
        conquer(arr, si, mid, ei);
    } 
     public static void main(String[] args) {
        int[] arr = {-7, 2, 3, 5, 7, 3, 9, 1};
        divide(arr, 0, arr.length- 1);
        print(arr);
    }
    
}
