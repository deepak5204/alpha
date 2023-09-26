package Array2D;

public class DiagonalSum {

    public static void calcDiagonalSum(int[][] arr) {
        int sum = 0;

        // optimize approach
        for(int i = 0; i < arr.length; i++){
            //primary diagonal
            // sum += arr[i][i];
            
            //second diagonal
            // if(i + (arr.length - 1 - i) == arr.length - 1){
            //     sum += arr[i][arr.length - 1 - i];
            // }

            if(i != arr.length - 1 -i){
                sum += arr[i][arr.length - 1 - i];
            }
        }

        // // brute force approach
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {

        //         // calculate primary diadonal
        //         if (i == j) {
        //             sum += arr[i][j];
        //         }
        //         if (i + j == arr.length - 1) {
        //             if (i != j) {
        //                 sum += arr[i][j];
        //             }
        //         }
        //     }
        // }

        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        calcDiagonalSum(arr);
    }

}
