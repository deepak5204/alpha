package Pattern;

public class PrintInvertedHalfDiamond {
    public static void main(String[] args){
        int n = 9;

        for(int i = 0; i <= n/2; i++){
            //spaces
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - 2 * i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
