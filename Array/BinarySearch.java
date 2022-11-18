package Array;

public class BinarySearch {

    public static int binSarch(int [] arr, int key){
        int start = 0; int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key == mid){
                return mid;
            } else if(mid < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    return -1;        
    }
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int res = binSarch(arr, 6);
        if(res == -1){
            System.out.println("Not found");
        } else {
            System.out.println(res);
        }
        
    }
    
}
