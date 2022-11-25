package Array2D;

public class SearchElementInSortedArray {

    public static void search(int[][] arr, int key) {

        // // optimize approach
        // // start search from upper right corner of the matrix
        // int row = 0;
        // int col = arr[1].length - 1;
        // while (row < arr.length && col >= 0) {
        //     if (key == arr[row][col]) {
        //         System.out.println(row + "," + col);
        //         return;
        //     } else if (key > arr[row][col]) {
        //         row++;
        //     } else {
        //         col--;
        //     }
        // }
        // System.out.println("Not found!");

        // start search from upper right corner of the matrix
        int row = arr.length - 1;
        int col = 0;
        while (row >= 0 && col < arr[1].length) {
            if (key == arr[row][col]) {
                System.out.println(row + "," + col);
                return;
            } else if (key > arr[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Not found!");



        // //Brute force approach
        // for(int i = 0; i < arr.length; i++){
        // for(int j = 0; j < arr[1].length; j++){
        // if(arr[i][j] == key){
        // System.out.println(i+","+j);
        // return;
        // }
        // }
        // }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3, 5, 7 },
                { 2, 4, 6, 8 },
                { 9, 11, 13, 15 },
                { 12, 14, 16, 19 }
        };

        int key = 16;

        search(arr, key);
    }
}
