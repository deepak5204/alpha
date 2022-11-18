package Array;

public class LinearSearch{

public static int search(int[] arr, int key){
 for(int i = 0; i < arr.length; i++){
    if(arr[i] == key){
        return i;
    }
 }
  return -1;
}
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 8};    
        int res = search(arr, 6);
        if(res == -1){
            System.out.println("Not found");
        } else {
            System.out.println(res);
        }
    }
}