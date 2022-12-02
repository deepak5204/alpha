package Recursion;

public class FindFirstOccurence {
    public static int firstOccuren(int [] arr, int i,int key){

        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccuren(arr, i + 1, key);

    }
    public static void main(String[] args){
        int [] arr = {2, 4, 5, 7, 3, 5, 2, 8, 4};
        int res = firstOccuren(arr, 0, 5);
        System.out.println(res);

    }
}
