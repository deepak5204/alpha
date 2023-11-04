package DivideAndConquer;

public class SearchInRotatedArray {

    //by using loop
    public static int search2(int[] arr, int tar){
        int si = 0; int ei = arr.length - 1;
        while(si <= ei){
            int mid = si + (ei - si)/2;

            if(arr[mid] == tar){
                return mid;
            }
             
            else if(arr[si] < arr[mid] ){
                if(tar <= arr[mid] && tar >= arr[si]){
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }
            else {
                if( tar <= arr[ei] && tar >= arr[mid]){
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
    
    public static int search(int[] arr, int tar, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei - si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        //element lie on L1
        if(arr[si] <= arr[mid] && tar <= arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else {
                //case b: right
                return search(arr, tar, mid+1, ei);
            }
        }

        //element lie on L2
        else {
            //case c: right
            if(tar >= arr[mid] && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } 
            else {
                //case d: left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int arr[] ={4, 5, 6, 7, 1, 2, 3};
        int tar = 2;
        
        System.out.println(search(arr, tar, 0, arr.length - 1));
        System.out.println(search2(arr, tar));
    }
}
