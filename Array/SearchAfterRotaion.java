package Array;

public class SearchAfterRotaion {

    //search target element in rotated array
    public static int search(int[] arr, int left, int right, int target) {
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return -1;
    }


    //search minimum element in rotated array
    public static int minSearch(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && arr[mid - 1] > arr[mid]){
                return mid;
            } else if(arr[left] <= arr[mid] && arr[mid] > arr[right]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    //search element
    public static int search(int[] arr, int target) {
        
        //search minimum element in array
        int min = minSearch(arr);
        // System.out.println(min);

        //search target element
        if(target >= arr[min] && target < arr[arr.length - 1]){
           return search(arr, min, arr.length-1, target);
        } else {
            return search(arr, 0, min, target);
            
        }
    }

    //reverse array
    public static void reverse(int[] arr, int si, int ei) {
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void rotate(int[] arr, int k) {
        //rotate array by reverse element

        //reverse all array
        reverse(arr, 0, arr.length - 1);

        //int n = arr.length ;
        //reverse arrar elements from 0 to n - 1 - k;
        reverse(arr, 0, arr.length - 1 - k);

        //reverse array elements from n - k to n - 1
        reverse(arr, arr.length - k, arr.length - 1);

        
    // return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5, 6, 7};
        int k= 3;
        rotate(arr, k);
        
        // //print rotataed array
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        int target = 7;
        int res = search(arr, target);
        System.out.println(res);
        
    }
}
