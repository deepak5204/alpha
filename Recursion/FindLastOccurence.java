package Recursion;

public class FindLastOccurence {
    public static int lastOccurence(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
         int isFound = lastOccurence(arr, i + 1, key);
        //  System.out.println(isFound);
        if(isFound == -1){
            if(arr[i] == key){
                return i;
            } else {
                return -1;
            }
        } else {
            return isFound;
        }

        
    }
    public static void main(String[] args) {
        int [] arr ={4, 5, 5, 8, 6};
        int res = lastOccurence(arr, 0, 5);
        System.out.println(res);
        
    }
}
