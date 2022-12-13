package Recursion;

public class FindAllOccurences {

    public static void printOccurenes(int [] arr, int key, int i){
        //base case
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }

        printOccurenes(arr, key, i+1);
    }
    public static void main(String[] args){
        int [] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printOccurenes(arr, 2, 0);
    }
}
