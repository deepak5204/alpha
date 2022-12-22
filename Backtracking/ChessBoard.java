package Backtracking;

public class ChessBoard {

    public static boolean isSafe(char[][] board, int row, int col){
        //vertically up
        for(int i = row - 1; i >= 0; i--){
           if( board[i][col] == 'Q'){
               return false;
           }   
        }

        //diag left up
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if( board[i][j] == 'Q'){
                return false;
            }
        }

        //diag right up
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if( board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static int count = 0;

    ////print all possible ways and count ways 
    // public static void nQueens(char[][] board, int row){
    //     //base case
    //     if(row == board.length){
    //         count++;
    //         // printBoard(board);
    //         return;
    //     }
 
    //     //column loop
    //     for(int j = 0; j < board.length; j++){
    //        if(isSafe(board, row, j)){
    //             board[row][j] = 'Q';
    //             nQueens(board, row+1); //function call
    //             board[row][j] = 'x'; //backtracking step
    //        }
    //     }
    // }


    ////nQueen for only one solution
    public static boolean nQueens(char[][] board, int row){
        //base case
        if(row == board.length){           
            count++;
            // printBoard(board);
            return true;
        }
     
        //column loop
        for(int j = 0; j < board.length; j++){
           if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){ //function call
                    return true;
                } 
                board[row][j] = 'x';
           } 
        }
        return false;
    }

    //print board
    public static void printBoard(char[][] board){
        System.out.println("----------------chess board----------------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }

        // nQueens(board, 0);
        // System.out.println("Total no of ways to solve n queens = "+ count);

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
    }
}
