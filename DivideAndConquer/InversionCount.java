package DivideAndConquer;

public class InversionCount {

    public static int merge(int[] arr, int si, int mid, int ei){

        int i = si;
        int j = mid;
        int k = 0;
        int invCount = 0;
        int[] temp = new int[ei - si + 1];

        while(i < mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                j++;
            }
            k++;
        }

        while(i < mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++]; 
        }

        // copy element from temporary array to original array
        for(i = si, k = 0; i <= ei; i++, k++){
            arr[i] = temp[k];
        }

        return invCount;
    }

    public static int getInversion(int[] arr, int si, int ei){
        int invCount = 0;
        
        if(ei > si){
            int mid = si + (ei - si)/2;
            invCount = getInversion(arr, si, mid);
            invCount += getInversion(arr, mid+1, ei);
            invCount += merge(arr, si, mid+1, ei);
        }

        return invCount;
        
    }
    public static void main(String[] args){
        int[] arr = {5, 2, 4, 6, 7};
        int res = getInversion(arr, 0, arr.length - 1);
        System.out.println(res);

    //    int res = inversion(arr);
    //    System.out.println(res);
    }

    // //brute force approach
    // private static int inversion(int[] arr) {
    //     int count = 0;
    //     for(int i = 0; i < arr.length - 1; i++){
    //         for(int j = 1; j < arr.length; j++){
    //             if(arr[i] > arr[j] && i < j){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
}
