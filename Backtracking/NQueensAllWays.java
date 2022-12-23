package Backtracking;

public class NQueensAllWays {

    public static boolean isSafe(char[][] board, int row, int col){

        //diag left up
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //horizontally left
        for(int j = col; j >= 0; j--){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // diag left down
        for(int i = row, j = col; i < board.length && j >= 0; i++, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //vertically up
        for(int i = row; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        return true;
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

    public static void nQueen(char[][] board, int col){
        //base case
        if(col == board.length){
            printBoard(board);
            return;
        }

        // place queen column wise
        for(int i = 0; i < board.length; i++){
           if(isSafe(board, i, col)){
            board[i][col] = 'Q';
            nQueen(board, col+1); //function call
            board[i][col] = 'x'; //Backtracking step
           }
        }
    }
    public static void main(String[] args){
        int n = 4;
        char [][] board = new char[n][n];

        //initialize
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }

        nQueen(board, 0);
    }
}
