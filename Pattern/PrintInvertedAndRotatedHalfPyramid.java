package Pattern;

public class PrintInvertedAndRotatedHalfPyramid {
    public static void main(String[] args){
        int n = 5;

        for(int i = 0; i < n; i++){
            //spaces
            for(int j = 0; j < n - i + 1; j++){
                System.out.print(" ");
            }

            //print *
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
