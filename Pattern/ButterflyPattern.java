package Pattern;

public class ButterflyPattern {
    public static void main(String[] args){
        int n = 5;

        //UPPER PART
        for(int i = 1; i <= n; i++){
            //print * - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //print spaces - 2 * (n - i)
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            // print * - 1
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        //LOWER PART
        for(int i = n; i >= 1; i--){
            //print * - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //print spaces - 2 * (n - i)
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            // print * - 1
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
