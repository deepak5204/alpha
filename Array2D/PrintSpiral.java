package Array2D;

public class PrintSpiral {

    public static void printSpiral(int arr[][]) {
        int startRow = 0, endRow = arr.length - 1;
        int startCol = 0, endCol = arr[1].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i]+" ");
            }

            //right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int i = endCol - 1; i >= startCol; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][i]+" ");
            }

            //left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startRow += 1;
            startCol += 1;
            endRow -= 1;
            endCol -= 1;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12}
        };

        printSpiral(arr);
    }
}
