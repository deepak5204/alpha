package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

       //upper part 
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

               //print *
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

               //print *
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
