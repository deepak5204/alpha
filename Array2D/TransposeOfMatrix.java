package Array2D;

public class TransposeOfMatrix {

    public static void transpose(int [][] mat) {
        int Tmat[][] =new int[mat[1].length][mat.length];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[1].length; j++){
                Tmat[j][i] = mat[i][j];
            }
        }

        //print transpose matrix
        for(int i = 0; i < Tmat.length; i++){
            for(int j = 0; j < Tmat[1].length; j++){
                System.out.print(Tmat[i][j]+" ");    
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            { 1, 3, 5, 7 },
            { 2, 4, 6, 8 },
            // { 9, 11, 13, 15 },
            // { 12, 14, 16, 19 }
    };
    transpose(arr);
    }
}
